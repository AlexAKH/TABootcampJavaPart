package com.bootcampexercise.module10;

public class AbstractActivity {

    public static void main(String [] args) {

        Employee e = new Employee();

        e.setName("Bruce Willis");
        e.setAge(67);
        e.setCompany("Apple");
        e.setSalary(80000);
        e.setJobTitle("Bodyguard");

        Student st = new Student();
        st.setSchoolName("ABC School");

        System.out.println(e.introduce());
        System.out.println(st.introduce());




    }
}
