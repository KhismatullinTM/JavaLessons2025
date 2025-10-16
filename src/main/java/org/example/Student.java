package org.example;


public class Student {
    int NumberStudentCard;
    String Name;
    String LastName;
    int YearOfStudy;
    double AverageMath;
    double AverageEconomy;
    double AverageForeignLang;
}
    class StudentTest {

        public static void main(String[] args) {
            Student StOne = new Student();
            Student StTwo = new Student();
            Student StThree = new Student();

            StOne.Name = "Nikita";
            StOne.LastName = "Mamontov";
            StOne.YearOfStudy = 2016;
            StOne.AverageEconomy = 5;
            StOne.AverageForeignLang = 4.5;
            StOne.AverageMath = 4.5;

            StTwo.Name = "Antonio";
            StTwo.LastName = "Petrov";
            StTwo.YearOfStudy = 2018;
            StTwo.AverageEconomy = 5;
            StTwo.AverageForeignLang = 4.5;
            StTwo.AverageMath = 4.5;

            StThree.Name = "Alsu";
            StThree.LastName = "Sharafutdinova";
            StThree.YearOfStudy = 2019;
            StThree.AverageEconomy = 3;
            StThree.AverageForeignLang = 3.5;
            StThree.AverageMath = 3.5;

            System.out.println("Средняя арифметическая оценка студента" + " " + StOne.Name + " " + StOne.LastName + ":" + (StOne.AverageEconomy + StOne.AverageForeignLang + StOne.AverageMath)/3);
            System.out.println("Средняя арифметическая оценка студента" + " " + StTwo.Name + " " + StTwo.LastName + ":" + (StTwo.AverageEconomy + StTwo.AverageForeignLang + StTwo.AverageMath)/3);
            System.out.println("Средняя арифметическая оценка студента" + " " + StThree.Name + " " + StThree.LastName + ":" + (StThree.AverageEconomy + StThree.AverageForeignLang + StThree.AverageMath)/3);
        }
    }

