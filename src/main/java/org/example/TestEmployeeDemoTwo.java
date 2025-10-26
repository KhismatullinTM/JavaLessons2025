package org.example;

public class TestEmployeeDemoTwo {
    public static void main (String[] args){
        org.example.Employee emp1 = new org.example.Employee(1,"Maks",5);
        org.example.Employee emp2 = new org.example.Employee(1,"Misha",3,123.1);
        emp1.showName();
        emp2.showName();
    }
}
