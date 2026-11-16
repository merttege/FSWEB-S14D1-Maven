package com.workintech.cylinder;

public class Circle {
    public double radius;

    public Circle(double radius){
        if(radius < 0){
            radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
