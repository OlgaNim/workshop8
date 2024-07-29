package com.example;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    double radius;

    public Circle(int circle) {
        radius = 1;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }
}