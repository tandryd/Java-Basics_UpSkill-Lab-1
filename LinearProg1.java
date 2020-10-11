import java.util.*;

public class LinearProg1 {
    public static void main(String[] args) {

        System.out.println("Введите значение a:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        System.out.println("Введите значение b:");
        double b = scan.nextDouble();

        System.out.println("Введите значение c:");
        double c = scan.nextDouble();

        double z = ((a - 3) * b / 2) + c;
        System.out.printf("значение  функции z = ( (a – 3 ) * b / 2) + c  = %.10f", b, z);
    }
}
