import java.util.Scanner;

public class LinearProg5 {
    public static void main(String[] args) {
        System.out.print("Введите значение секунд: ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        int HH = t / 3600;
        int MM = (t - HH*3600)/60; // (t/60)%60
        int SS = t - (HH * 3600) - (MM * 60); // T%60
        System.out.println(t + "c = " + HH + "ч " + MM + "мин " + SS + " сек");
    }
    }
