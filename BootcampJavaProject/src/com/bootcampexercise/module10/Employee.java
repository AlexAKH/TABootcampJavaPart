package com.bootcampexercise.module10;

import java.util.List;

public class Employee extends Person {

    private String jobTitle, company;
    private double salary;


    public Employee() {

    }

    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String introduce() {
        String intro1 = "My name is " + name + " and I am " + age + " years old.";
        String intro2 = "I am work as " + jobTitle + " in " + company + " and my salary is " + salary;
        return intro1 + intro2;
    }

    public String getHighestPaidEmp(List<Employee> list) {
        Employee temp = new Employee();
        temp = list.get(0);
        double max = temp.getSalary();
        String tempName = temp.getName();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (max < temp.getSalary()) {
                max = temp.getSalary();
                tempName = temp.getName();
            }
        }
        return tempName;

    }
}