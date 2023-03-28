package org.example;

import java.time.LocalDate;

public class BankAccount {
//    Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private double interest;


    //    Constructor
    public BankAccount(String inputfirstName, String inputlastName, LocalDate dateOfBirth, int accountNumber){
            this.firstName = inputfirstName;
            this.lastName = inputlastName;
            this.dateOfBirth = dateOfBirth;
            this.accountNumber = accountNumber;
            this.balance = 0;
    }


    //        Methods
            public String generateStatement(){
                return "Hello " + this.firstName +" " +  this.lastName + "! Date of Birth : " + this.dateOfBirth + ". Account Number : " + this.accountNumber + "." ;

            }
//     Deposit
    public void deposit(double amount) {
        balance = balance + amount;
    }                             //display full balance

//    Withdrawal
    public void withdrawal(double amount){
        balance = balance - amount;
    }


//    Interest Method
    public void payInterest(double interestRates){
        interest = balance * interestRates;
        balance = balance + interest;
    }

//    Getters/Setters
    public double getBalance() {
        return balance;
    }
}



