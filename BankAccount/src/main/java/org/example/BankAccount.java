package org.example;

import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;

    private LocalDate dateOfBirth;

    private int accountNumber;
    private double balance;

//    Constructor
    public BankAccount(String inputfirstName, String inputlastName, LocalDate dateOfBirth, int accountNumber){
        this.firstName = inputfirstName;
        this.lastName = inputlastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }

}
