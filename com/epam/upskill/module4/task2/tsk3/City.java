/*
 Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
package com.epam.upskill.module4.task2.tsk3;

public class City {
    private String cityName;
    private int cityPopulation;

    public City(String cityName, int cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
