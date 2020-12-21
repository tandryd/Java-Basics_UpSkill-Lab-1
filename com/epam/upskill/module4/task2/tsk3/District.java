/*
 Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
package com.epam.upskill.module4.task2.tsk3;

public class District {
    private String districtName;
    private City districtCenter;
    private double area;

    public District(String districtName, City districtCenter, double area) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
        this.area = area;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
