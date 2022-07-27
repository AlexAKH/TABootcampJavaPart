package com.bootcampexercise.module5.activity;

public class AbstractActivity {
    public static void main(String [] args) {
        // set and Print color of rectangle
        Shape rectangle = new Rectangle();
        rectangle.setColor("Turquoise");
        System.out.println("The color of the rectangle is "+rectangle.getColor());
        // Give area of rectangle
        rectangle.setLength(23.12);
        rectangle.setWidth(12.30);
        System.out.println("The area of the rectangle is "+rectangle.getArea());
        // Print perimeter of rectangle
        System.out.println("The perimeter of the rectangle is "+rectangle.getPerimeter());
        // set and Print color of circle
        Shape circle = new Circle();
        circle.setColor("Green");
        System.out.println("The color of the circle is "+circle.getColor());
        // Give area of circle
        circle.setRadius(25);
        System.out.println("The area of the circle is "+circle.getArea());
        // Print perimeter of circle
        System.out.println("The perimeter of the circle is "+circle.getPerimeter());
    }
}
