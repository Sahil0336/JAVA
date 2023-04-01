package com.Sahil;

class Employee{
    String name ;
    int emp_id;
    int age;
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Name: "+e1.name+"\nAge: "+e1.age+"\nSecond employee id: "+e2.emp_id);
    }
}
