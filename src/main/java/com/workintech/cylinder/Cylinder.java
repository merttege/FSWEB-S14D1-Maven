package com.workintech.cylinder;

public class Cylinder extends Circle{
    private double height;

    public  Cylinder(double height, double radius){
        if (height < 0){
            height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
