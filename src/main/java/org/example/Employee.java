package org.example;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;

    public void showId (){System.out.println("Студент с номером: " + id);}
    public  void showName (){System.out.println("Имя студента: " + surname);}
    public  void showAge (){System.out.println("Курс стундента: " + age);}

    private Employee (String surname3){
        this(0, surname3,0,0.0);
    }

    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0);
    }

    public Employee (int id1, String surname1, int age1, double salary1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
    }
}

    class EmployeeTest {
        public static void main (String [] args) {
        Employee emp1 = new Employee(1, "Никита", 3, 12.5);

        System.out.println(emp1.surname); // OK (public)
            System.out.println(emp1.id);      // OK (package-private в том же пакете)
            // System.out.println(e1.salary); // НЕЛЬЗЯ (private)
        emp1.showId();
        emp1.showName();
        emp1.showAge();
        };
    }