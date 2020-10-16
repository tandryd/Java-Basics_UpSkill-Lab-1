package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg4 {
    public static void main(String[] args) {

        System.out.print("Введите ширину отверстия. А = ");
        Scanner scanner = new Scanner(System.in);
        double widthHole = scanner.nextDouble();

        System.out.print("Введите длинну отверстия. В = ");
        double lengthHole = scanner.nextDouble();

        System.out.print("Введите ширину кирпича. X = ");
        double widthBrick = scanner.nextDouble();

        System.out.print("Введите длинну кирпича. Y = ");
        double lengthBrick = scanner.nextDouble();

        System.out.print("Введите высоту кирпича Z = ");
        double heightBrick = scanner.nextDouble();

        if (((widthHole>=widthBrick & lengthHole>=lengthBrick) | (widthHole>=lengthBrick & lengthHole>=widthBrick)) || ((widthHole>=widthBrick & lengthHole>=heightBrick) | (widthHole>=heightBrick & lengthHole>=widthBrick)) || ((widthHole>=lengthBrick & lengthHole>=heightBrick) | (widthHole>=heightBrick & lengthHole>=lengthBrick))) {
            System.out.println("Кирпич проходит через отверстие");
        }
            else System.out.println("Кирпич не проходит через отверстие");

        }
    }
