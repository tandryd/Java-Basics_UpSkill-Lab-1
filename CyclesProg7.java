import java.util.Scanner;
public class CyclesProg7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i ,j;
        System.out.print("Введите значение начала промежутка m: ");
        int m = scanner.nextInt();
        System.out.print("Введите значение окончания промежутка n: ");
        int n = scanner.nextInt();
        for (i=m; i<=n; i++) {
            for (j=2; j<i; j++){
                if (i%j==0) {
                    System.out.println(i + "-"+ j);
                }
            }
        }
    }
}
