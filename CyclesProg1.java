import java.util.InputMismatchException;
import java.util.Scanner;
public class CyclesProg1 {
    public static void main(String[] args) {
        int number;
        while (true) {
            try {
                System.out.print("Введите целое положительное число : ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }
        int sum = 0;
        for (int i=1; i<=number; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел = " + sum);


    }
}
