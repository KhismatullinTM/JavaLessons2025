package org.example;

public class BankAccount {
        int AccountNumber;
        double balance = 100.0;

        void popolnenieScheta (int popolnenie) {
            System.out.println("Баланс до пополнения: " + balance);
            System.out.println("Сумма пополнения: " + popolnenie);
            balance+= popolnenie;
            System.out.println("Баланс после пополнения: " + balance);
            System.out.println();
        };

        void spisanieSoScheta (int spisanie) {
            System.out.println("Баланс до списания: " + balance);
            System.out.println("Сумма списания: " + spisanie);
            balance-= spisanie;
            System.out.println("Баланс после списания: " + balance);
            System.out.println();
        }
    }

    class BankAccountTest {
        public static void main (String [] args){
            BankAccount bankAccountOne = new BankAccount();

            bankAccountOne.popolnenieScheta (30);
            bankAccountOne.spisanieSoScheta (20);
    }
}
