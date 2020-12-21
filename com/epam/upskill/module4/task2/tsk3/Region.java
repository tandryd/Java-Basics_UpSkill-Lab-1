/*
 Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
package com.epam.upskill.module4.task2.tsk3;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private City regionCenter;
    private double regionArea;
    private ArrayList<District> regionDistricts;

    public Region(String regionName, City regionCenter, double regionArea) {
        this.regionName = regionName;
        this.regionCenter = regionCenter;
        this.regionArea = regionArea;
        this.regionDistricts = new ArrayList<>();
    }

    public double getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }

    int getRegionPopulation (){
        int regionPopulation = 0;
        for (District district:this.regionDistricts) {
        regionPopulation += district.getDistrictCenter().getCityPopulation();
        }
        return regionPopulation;
    }

    void addDistrict (District district){
        regionDistricts.add(district);
    }

    void removeDistrict (String districtName) {
        for (District district : regionDistricts) {
            if (districtName.equals(district.getDistrictName())) {
                regionDistricts.remove(district);
            }
        }
    }

    public String getRegionCenter() {
        return regionCenter.getCityName();
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public ArrayList<District> getRegionDistricts() {
        return regionDistricts;
    }

    public void setRegionDistricts(ArrayList<District> regionDistricts) {
        this.regionDistricts = regionDistricts;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
