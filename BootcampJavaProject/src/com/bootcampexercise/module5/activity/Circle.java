package com.bootcampexercise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class

//Per = 3.14*radius; Area = 3.14* radius2
public double getArea() {
    return 3.14*radius*radius;
}
    public double getPerimeter() {
        return 2*3.14*radius;
    }

}