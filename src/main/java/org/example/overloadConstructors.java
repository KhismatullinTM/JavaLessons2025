package org.example;

public class overloadConstructors {


    overloadConstructors () {
        this (0, 0, 0, 0, 0 );
    }
    overloadConstructors (int a4, int b4) {
        this (a4, b4, 0, 0, 0 );
    }

    overloadConstructors (int a3, int b3,int c3) {
        this (a3, b3, c3, 0, 0 );
    }

    overloadConstructors (int a2, int b2, int c2, int d2) {
        this (a2, b2, c2, d2, 0);

    }

    overloadConstructors (int a1, int b1, int c1, int d1, int e1) {

        numberOne = a1;
        numberTwo = b1;
        numberThree = c1;
        numberFour = d1;
        numberFive = e1;

    }

    int numberOne;
    int numberTwo;
    int numberThree;
    int numberFour;
    int numberFive;

    int sum () {
        return numberOne+numberTwo+numberThree+numberFour+numberFive;
    }

}

class overloadConstructorsTest {
    public static void main (String [] args) {

        overloadConstructors overloadConstructors = new overloadConstructors ( 2,3,4,5,6 );
        System.out.println(("Cумма чисел = " + overloadConstructors.sum()));
        overloadConstructors overloadConstructors2 = new overloadConstructors ( 2,3,4,5);
        System.out.println("Cумма чисел = " + overloadConstructors2.sum());
        overloadConstructors overloadConstructors3 = new overloadConstructors ( 2,3,4 );
        System.out.println("Cумма чисел = " + overloadConstructors3.sum());
        overloadConstructors overloadConstructors4 = new overloadConstructors ( 2,3);
        System.out.println("Сумма чисел = " + overloadConstructors4.sum());
        overloadConstructors overloadConstructors5 = new overloadConstructors ();
        System.out.println("Сумма чисел = " + overloadConstructors5.sum());
    }
}
