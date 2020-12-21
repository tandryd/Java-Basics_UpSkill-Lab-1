/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package com.epam.upskill.module4.task2.tsk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperateCar {
    public static void main(String[] args) {
        Car volvoXC60 = new Car("Volvo XC60");
        System.out.printf("Our app created a car %s. Trying to drive:%n", volvoXC60.getModelName());
        volvoXC60.run();

        Engine engine = new Engine(370, 3.0);
        volvoXC60.setEngine(engine);
        System.out.printf("%nA %d hp engine is installed. Engine capacity is %.3f liters. Trying to drive:%n",
                engine.getPower(), engine.getVolume());
        volvoXC60.run();

        int wheelDiametr = 19;
        Wheel w1 = new Wheel(wheelDiametr);
        Wheel w2 = new Wheel(wheelDiametr);
        Wheel w3 = new Wheel(wheelDiametr);
        Wheel w4 = new Wheel(wheelDiametr);

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(w1);
        wheels.add(w2);
        wheels.add(w3);
        wheels.add(w4);

        volvoXC60.setWheels(wheels);
        System.out.printf("%nWheels are installed. Trying to drive:\n");
        volvoXC60.run();

        volvoXC60.getWheels().get(3).breakWheel();
        System.out.println("\nSTOP! Something broke:");
        volvoXC60.run();

        volvoXC60.changeWheel(wheels);
        System.out.println("\nTrying to drive:");
        volvoXC60.run();

        System.out.println("...");
        volvoXC60.setFuel(false);
        volvoXC60.run();
        volvoXC60.refuel();
        volvoXC60.run();

        Car ferrariF50 = new Car("Ferrari F50", new Engine(460, 4.0), new ArrayList<>(Arrays.asList(new Wheel(18), new Wheel(18), new Wheel(18), new Wheel(18))), true);
        System.out.printf("\nOur app created a new car %s. Trying to drive:%n", ferrariF50.getModelName());
        ferrariF50.run();
    }

}
