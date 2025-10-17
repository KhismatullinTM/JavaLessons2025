package org.example;

public class Employee {
        int id;
        String surname;
        int age;
        double salary;

        Employee(int id1, String surname1, int age1, double salary1) {
            id = id1;
            surname = surname1;
            age = age1;
            salary = salary1;
        }

        double doubleSalary() {
            salary = salary * 2;
            return salary;
        }
    }

    class EmployeeTest {
        public static void main(String[] args) {
            org.example.Employee eOne = new org.example.Employee(20, "Timur", 25, 100);
            org.example.Employee eTwo = new org.example.Employee(25, "Damir", 30, 200);

            eOne.doubleSalary();
            System.out.println("Зарплата сотрудника " + eOne.surname + " = " + eOne.salary);

            eTwo.doubleSalary();
            System.out.println("Зарплата сотрудника  " + eTwo.surname + " = " + eTwo.salary);
        }
    }