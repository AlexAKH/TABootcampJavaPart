package com.bootcampexercise.module10;

public abstract class Person {

    String name;
    int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void Person() {
    this.name = "Unknown";
    this.age = 0;
        }

    void Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract String introduce();

}
