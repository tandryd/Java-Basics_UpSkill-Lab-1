/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package com.epam.upskill.module4.task2.tsk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private String modelName;
    private Engine engine;
    private List<Wheel> wheels;
    private boolean isFuel;

    public Car (String modelName) {
        this.modelName = modelName;
        this.wheels = new ArrayList<>(4);
        this.isFuel = true;
    }

    public Car(String modelName, Engine engine,  ArrayList<Wheel> wheels, boolean isFuel) {
        this.modelName = modelName;
        this.engine = engine;
        this.wheels = wheels;
        this.isFuel = isFuel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public String getModelName() {
        return modelName;
    }

    void changeWheel(List<Wheel> wheels) {
        for (Wheel wheel: wheels) {
            if (!wheel.isGood()) {
                System.out.printf("Wheel number %d is changed.\n", wheels.indexOf(wheel) + 1);
                wheel.setGoodWheel();
            }
        }
    }

    void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    void refuel() {
        this.isFuel = true;
        System.out.println("The car is refueled.");
    }

    void run() {
        int wheelCounter = 0;
        String message = "";
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        checkIfWheelsInstalled(wheelCounter, message);
        if (engine == null) {
            System.out.println("- engine not installed. Please install the engine.");
        } else {
            isEngine = true;
        }

        if (isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (Wheel wheel: wheels) {
                if (!wheel.isGood()) {
                    System.out.printf("- wheel number %d is broken. Please replace the wheel.%n", wheels.indexOf(wheel) + 1);
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("- out of fuel. It is necessary to refuel.");
            } else if (ready) {
                System.out.println("- the car goes on the road!");
            }
        }
    }

    private void checkIfWheelsInstalled(int wheelCounter, String message) {
        if (wheelCounter == 0) {
            message = "- wheels are not installed. Please install 4 wheels.\n";
        } else if (wheelCounter == 1 || wheelCounter == 2 || wheelCounter == 3) {
            message = String.format("- only %d wheels installed. Please install %d more wheels\n", wheelCounter, 4 - wheelCounter);
        }
        System.out.print(message);
    }
}
