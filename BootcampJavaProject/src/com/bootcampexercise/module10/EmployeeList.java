package com.bootcampexercise.module10;

import com.bootcampexercise.module10.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EmployeeList {

        //static List <Employee> list = new ArrayList <Employee>();

        public static void main(String[] args) {

                Employee e1 = new Employee();
                e1.setCompany("Facebook");
                e1.setSalary(95000.12);
                e1.setJobTitle("COO");


                Employee e2 = new Employee();
                e2.setCompany("Apple");
                e2.setSalary(80000.40);
                e2.setJobTitle("CEO");

                Employee e3 = new Employee();
                e3.setCompany("Accenture");
                e3.setSalary(48000.60);
                e3.setJobTitle("Tester");

                Employee e4 = new Employee();
                e4.setCompany("Toyota");
                e4.setSalary(120000.69);
                e4.setJobTitle("Director");

                Employee e5 = new Employee();
                e5.setCompany("Samsung");
                e5.setSalary(95000.60);
                e5.setJobTitle("Developer");

                List<Employee> list = new ArrayList<Employee>();
                list.add(e1);
                list.add(e2);
                list.add(e3);
                list.add(e4);
                list.add(e5);

                EmployeeList arr = new EmployeeList();
                System.out.println(list);


                Employee obj = new Employee();
                System.out.println("The Employee whose salary is the highest is : " + obj.getHighestPaidEmp(list));


        }
}




