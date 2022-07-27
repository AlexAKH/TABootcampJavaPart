package com.bootcampexercise.module5.activity;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
//P = (a+b)*2; A=a*b
    public double getArea()
    {
        return 2*this.length*this.width;
    }
    public double getPerimeter()
    {
        return this.length*this.width;
    }
}
