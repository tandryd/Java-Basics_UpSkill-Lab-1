import java.util.*;
public class CyclesProg8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number_1, number_2;
        System.out.print("Введите первое число: ");
        number_1 = scanner.nextInt();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
            do {
                array1.add(number_1 % 10);
                number_1 /= 10;
            } while (number_1 > 0);
        System.out.print("Введите второе число: ");
        number_2 = scanner.nextInt();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
            do {
                array2.add(number_2 % 10);
                number_2 /= 10;
            } while (number_2 > 0);
        array1.retainAll(array2);
        System.out.println("Cовпадают цифры: " + array1);
    }
}

