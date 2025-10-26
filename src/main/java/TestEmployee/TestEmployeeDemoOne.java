package TestEmployee;

public class TestEmployeeDemoOne {

    public static void main (String[] args){
        org.example.Employee emp3 = new org.example.Employee(2,"Alex", 4, 12300.1);
        System.out.println(emp3.surname); // OK (public)
        // OK (package-private в том же пакете)
        // System.out.println(e1.salary); // НЕЛЬЗЯ (private)
        emp3.showId();
        emp3.showName();
        emp3.showAge();
    }

}


