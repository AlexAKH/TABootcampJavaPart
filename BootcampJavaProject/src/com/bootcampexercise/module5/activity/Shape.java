package com.bootcampexercise.module5.activity;

public abstract class Shape {

    public String color;
    public double length;
    public double width;
    public double radius;
    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double getPerimeter();

    public abstract double getArea();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}
