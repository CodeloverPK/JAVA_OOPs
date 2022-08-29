package com.edureka;

public class Employee extends Manager {
    public static void main(String[] args){
        Employee e=new Employee();
        e.salery=1000;
        System.out.println("Employee Salery "+e.salery);
        Manager m=new Manager();
        m.salery=100000;
        System.out.println("Manager Salery "+m.salery);
    }
}
