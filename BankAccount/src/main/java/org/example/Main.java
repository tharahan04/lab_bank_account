package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Display total balance with interest
        BankAccount account1 = new BankAccount("Tharahan", "Tharmaraja", LocalDate.of(2000,3,4), 12345678);
        account1.deposit(1000);
        account1.withdrawal(500);
        account1.payInterest(0.01);

        String statement= account1.generateStatement();
        System.out.println(statement);

        System.out.println("Your total balance : " + account1.getBalance());









    }
}