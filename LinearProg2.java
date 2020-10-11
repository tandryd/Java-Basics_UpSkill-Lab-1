import java.util.Scanner;
import static java.lang.Math.*;

public class LinearProg2 {
    public static void main(String[] args) {

        System.out.print("Введите значение a: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scan.nextDouble();

        System.out.print("Введите значение c: ");
        double c = scan.nextDouble();

        double temp = sqrt(pow(b, 2) + 4 * a * c);

        double z = (b + temp) / 2 * a - pow(a, 3) * c + pow(b, -2);
        System.out.println("Значение функции z = " + z);

    }
}