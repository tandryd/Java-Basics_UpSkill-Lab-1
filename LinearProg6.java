import static java.lang.Math.*;
import java.util.Scanner;

public class LinearProg6 {
    public static void main(String[] args) {

        System.out.println("Введите значениие х: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Введите значение y: ");
        int y = scan.nextInt();

       Boolean z = (((y >= 0 && y <= 4 && abs(x) <= 2) || (y <= 0 && y >= -3 && abs(x) <= 4)) && (x != 0 || y != -1));

        System.out.println(z);


    }
}