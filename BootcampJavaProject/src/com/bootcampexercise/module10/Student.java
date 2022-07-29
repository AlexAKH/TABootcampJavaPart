package com.bootcampexercise.module10;

public class Student extends Person{

    private String schoolName;


    public String getSchoolName() {
        return schoolName;
    }

    void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    @Override
    public String introduce() {
        String intro1 = "I'm study in university " + schoolName + ".\n";
        return intro1;

    }
}
