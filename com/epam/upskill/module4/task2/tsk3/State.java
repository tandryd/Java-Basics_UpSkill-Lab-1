/*
 Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
package com.epam.upskill.module4.task2.tsk3;

import java.util.ArrayList;

public class State {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    State(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    void printNumberOfRegions() {
        System.out.printf("There are %d regions in %s.\n", this.regions.size(), countryName);
    }

    void printCapital() {
        System.out.printf("The capital of %s is %s.\n", getCountryName(), getCapital());
    }

    void printArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getRegionArea();
        }
        System.out.printf("The area of %s is %.3f thousand square kilometers.\n", countryName, area);
    }

    void printRegionCenters () {
        System.out.printf("Regional centers of the %s: ", countryName);
        for (Region region : regions) {
            System.out.print(region.getRegionCenter() + ", ");
        }
        System.out.println("\b\b.");
    }

    void addRegion (Region region) {
        regions.add(region);
    }

    void removeRegion (String regionName) {
        for (Region region : regions) {
            if (regionName.equals(region.getRegionName())) {
                regions.remove(region);
            }
        }
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital.getCityName();
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
