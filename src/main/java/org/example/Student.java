package org.example;

import java.util.Timer;

public class Student {
        int id;
        String Name;
        String LastName;
        int YearOfStudy;
        double AverageMath;
        double AverageEconomy;
        double AverageForeignLang;

    Student () {
        this (0, null, null,0,0.0,0.0,0.0);
    }


    Student (int idnum2, String Imya2, String Familiya2, int godObuch2) {
            this(idnum2, Imya2, Familiya2, godObuch2, 0.0,0.0,0.0);
        }

    Student (int idnum1, String Imya1, String Familya1, int godObuch1, double sredMath1, double sredEconomy1, double sredForeignLang1) {
        id = idnum1;
        Name = Imya1;
        LastName = Familya1;
        YearOfStudy = godObuch1;
        AverageMath = sredMath1;
        AverageEconomy = sredEconomy1;
        AverageForeignLang = sredForeignLang1;
    }

    }

    class StudentTest {
        void averageGrade (Student student ) {
            double srOcenka = (student.AverageEconomy + student.AverageForeignLang + student.AverageMath) / 3;
            System.out.println("Средняя арифметическая оценка студента" + " " + student.Name + " " + student.LastName  + ": " + srOcenka);
        };

        public static void main(String[] args) {

            Student studentOne = new Student(1, "Timur", "Khismatullin", 3, 4.3,4,5);
            Student studentTwo = new Student(2, "Alex", "Mamontov",4);
            Student studentThree = new Student();

            StudentTest Test =  new StudentTest();
            Test.averageGrade(studentOne);
            Test.averageGrade(studentTwo);
            Test.averageGrade(studentThree);

            System.out.println( "Студент " + "№ " + studentOne.id + " " + studentOne.Name + " " + studentOne.LastName + " " + studentOne.YearOfStudy);
            System.out.println("Студент " + "№ " + studentTwo.id + " " + studentTwo.Name + " " + studentTwo.LastName + " " + studentTwo.YearOfStudy);
            System.out.println("Студент " + "№ ");

//                Student StOne = new Student();
//                Student StTwo = new Student();
//                Student StThree = new Student();
//
//                StOne.Name = "Nikita";
//                StOne.LastName = "Mamontov";
//                StOne.YearOfStudy = 2016;
//                StOne.AverageEconomy = 5;
//                StOne.AverageForeignLang = 4.5;
//                StOne.AverageMath = 4.5;
//
//                StTwo.Name = "Antonio";
//                StTwo.LastName = "Petrov";
//                StTwo.YearOfStudy = 2018;
//                StTwo.AverageEconomy = 5;
//                StTwo.AverageForeignLang = 4.5;
//                StTwo.AverageMath = 4.5;
//
//                StThree.Name = "Alsu";
//                StThree.LastName = "Sharafutdinova";
//                StThree.YearOfStudy = 2019;
//                StThree.AverageEconomy = 3;
//                StThree.AverageForeignLang = 3.5;
//                StThree.AverageMath = 3.5;
//
//                StudentTest Test =  new StudentTest();
//                Test.averageGrade(StOne);
//                Test.averageGrade(StTwo);
//                Test.averageGrade(StThree);
            }
        }

