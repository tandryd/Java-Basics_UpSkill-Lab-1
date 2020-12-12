package com.epam.upskill.module5.task5.action;

import static com.epam.upskill.module5.task5.action.CheckInput.*;
import com.epam.upskill.module5.task5.builder.CandyPresentBuilder;
import com.epam.upskill.module5.task5.builder.FlowersPresentBuilder;
import com.epam.upskill.module5.task5.builder.PresentDirector;
import com.epam.upskill.module5.task5.enity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class CustomerAction {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer customer = new Customer();

    public void run() {
        System.out.println("Good afternoon! How can I call you?");
        customer.setName(getStringFromKeyboard());
        PresentDirector presentDirector = new PresentDirector();
        int option = chooseTypeOfPresent(presentDirector);

        customer.setPresent(presentDirector.buildPresent());

        if (option ==1){
            customer.getPresent().setProducts(randomFillWithCandies());
        }
        if (option==2){
            customer.getPresent().setProducts(randomFillWithFlowers());
        }

        System.out.println("Your gift for " + customer.getPresent().getName() + " is ready!");
        printPresent(customer.getPresent());
    }

    public int chooseTypeOfPresent(PresentDirector presentDirector){
        System.out.println("You can choose one of the types of presents:" +
                "\n 1. Sweet gift;" +
                "\n 2. Flower arrangement.");
        System.out.println("Enter option number");
        int option = getIntOptionFromKeyboard();
        switch (option) {
            case 1:
                presentDirector.setPresentBuilder(new CandyPresentBuilder());
                break;
            case 2:
                presentDirector.setPresentBuilder(new FlowersPresentBuilder());
                break;
        }
        return option;
    }


    public static Wrap chooseWrap() {
        System.out.println(customer.getName() + ", You can choose one of the types of wraps:");
        System.out.print(String.format("1. Cardboard box (price: %.2f);\n2. Metal Box (price: %.2f);\n" +
                        "3. Foil Pouch (price: %.2f);\n4. Plastic Bag (price: %.2f).",
                WrapType.CARDBOARD_BOX.getPrice(), WrapType.METAL_BOX.getPrice(),
                WrapType.FOIL_POUCHES.getPrice(), WrapType.PLASTIC_BAG.getPrice()));
        System.out.println("\nEnter packing option number:");
        int option = getIntOptionFromKeyboard();
        Wrap wrap = null;
        switch (option) {
            case 1: wrap = new Wrap(WrapType.CARDBOARD_BOX);
                break;
            case 2: wrap = new Wrap(WrapType.METAL_BOX);
                break;
            case 3: wrap = new Wrap(WrapType.FOIL_POUCHES);
                break;
            case 4: wrap = new Wrap(WrapType.PLASTIC_BAG);
        }
        return wrap;
    }

    private static List<Product> randomFillWithCandies() {
        List<Product> productsList = readCandyFile();
        List<Product> candyForPresent = new ArrayList<>();
        int presentsWeight = 0;
        double minPrice = 0.99;
        Random random = new Random();

        double restOfMoney = customer.getPresent().getPrice() - customer.getPresent().getWrap().getPrice();
        while (restOfMoney > 0) {
            Product candy = productsList.get(random.nextInt(productsList.size()));
            double candyPrice = candy.getPrice();
            int candyWeight = candy.getWeight();

            if (restOfMoney - candyPrice > 0) {
                candyForPresent.add(candy);
                presentsWeight += candyWeight;
                restOfMoney -= candyPrice;
            } else if (minPrice > restOfMoney) {
                break;
            }
        }
        customer.getPresent().setPrice(customer.getPresent().getPrice() - restOfMoney);
        customer.getPresent().setWeight(presentsWeight);
        return candyForPresent;
    }

    private static List<Product> randomFillWithFlowers() {
        List<Product> productsList = readFlowersFile();
        List<Product> flowersForPresent = new ArrayList<>();
        double minPrice = 0.99;
        Random random = new Random();
        double restOfMoney = customer.getPresent().getPrice() - customer.getPresent().getWrap().getPrice();
        while (restOfMoney > 0) {
            Product flowers = productsList.get(random.nextInt(productsList.size()));
            double candyPrice = flowers.getPrice();
            if (restOfMoney - candyPrice > 0) {
                flowersForPresent.add(flowers);
                restOfMoney -= candyPrice;
            } else if (minPrice > restOfMoney) {
                break;
            }
        }
        customer.getPresent().setPrice(customer.getPresent().getPrice() - restOfMoney);
        return flowersForPresent;
    }

    private static List<Product> readCandyFile() {
        List<Product> candies = new ArrayList<>();
        String filePath = "com/epam/upskill/module5/task5/data/candies.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] productLine = scanner.nextLine().split(" - ");
                try {
                    String productName = productLine[0];
                    int weight = Integer.parseInt(productLine[1]);
                    double price = Double.parseDouble(productLine[2]);
                    CandyType candyType;
                    switch (productLine[3]) {
                        case "Caramel": candyType = CandyType.CARAMEL;
                            break;
                        case  "Chocolate": candyType = CandyType.CHOCOLATE;
                            break;
                        case "Gummies": candyType = CandyType.GUMMIES;
                            break;
                        case "Licorice": candyType = CandyType.LICORICE;
                            break;
                        default: candyType = CandyType.CARAMEL;
                    }
                    candies.add(new Candy(productName, weight, price, candyType));
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Products information file not found.");
        }
        return candies;
    }

    private static List<Product> readFlowersFile() {
        List<Product> flowers = new ArrayList<>();
        String filePath = "com/epam/upskill/module5/task5/data/flowers.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] productLine = scanner.nextLine().split(" - ");
                try {
                    if (productLine.length >= 3) {
                        String productName = productLine[0];
                        double price = Double.parseDouble(productLine[1]);
                        FlowerType flowerType;
                        switch (productLine[2]) {
                            case "ROSE":
                                flowerType = FlowerType.ROSE;
                                break;
                            case "CHAMOMILE":
                                flowerType = FlowerType.CHAMOMILE;
                                break;
                            case "LILY":
                                flowerType = FlowerType.LILY;
                                break;
                            case "CARNATOIN":
                                flowerType = FlowerType.CARNATOIN;
                                break;
                            default:
                                flowerType = FlowerType.ROSE;
                        }
                        flowers.add(new Flower(productName, price, flowerType));
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Products information file not found.");
        }
        return flowers;
    }

    public void printPresent(Present present) {
        System.out.println(present);
    }
}
