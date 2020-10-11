import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class BranchingProg5 {
    public static void main(String[] args) {

        double x;
        while (true) {
            try {
                System.out.print("Введите значение x: ");
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }

        double functionFx;
        if (x <= 3)
            functionFx = pow(x, 2) - 3 * x + 9;
        else functionFx = 1 / ((pow(x, 3) + 6));
        System.out.println("Значение функции f(x) = " + functionFx);
    }
}

