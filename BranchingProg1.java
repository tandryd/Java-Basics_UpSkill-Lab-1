import java.util.Scanner;

public class BranchingProg1 {
    public static void main(String[] args) {
        System.out.println("Введите значениие угла х: ");
        Scanner scan = new Scanner(System.in);
        int angle_X = scan.nextInt();

        System.out.println("Введите значениие угла angle_Y: ");
             int angle_Y = scan.nextInt();

        if (angle_X + angle_Y <180) {
            System.out.println("Треугольник с такими углами существует. ");
            if (angle_X + angle_Y ==90)
                System.out.print("Он прямоугольный.");
            else System.out.print("Он не прямоугольный.");
        }
        else
            System.out.println("Треугольник с такими углами не cуществует. ");
    }
}
