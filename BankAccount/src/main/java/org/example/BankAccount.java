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


//     Constructor
    public BankAccount(String inputfirstName, String inputlastName, LocalDate dateOfBirth, int accountNumber){
            this.firstName = inputfirstName;
            this.lastName = inputlastName;
            this.dateOfBirth = dateOfBirth;
            this.accountNumber = accountNumber;
            this.balance = 0;
    }

    //    Getters/Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


//     Deposit
        public void deposit(double amount) {
            balance = balance + amount;
        }                             //display full balance

//     Withdrawal
        public void withdrawal(double amount){
            balance = balance - amount;
        }

//     Interest Method
    public void payInterest(double interestRates) {
        interest = balance * interestRates;
        balance = balance + interest;
    }

        public String generateStatement(){
            return "My name is " + this.firstName + " " + this.lastName + "." + " My Date of birth is "
                    + this.dateOfBirth;
        }







}



