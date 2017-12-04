package com.company;


/**
 * Your job is to create a simple banking application.
 * There should be a Bank class
 * It should have an arraylist of Branches
 * Each Branch should have an arraylist of Customers
 * The Customer class should have an arraylist of Doubles (transactions)
 * Customer:
 * Name, and the ArrayList of double.
 * Branch:
 * Need to be able to add a new customer and initial transaction amount.
 * Also needs to be add additional transactions for that customer/branch
 * Bank;
 * Add a new branch
 * Add a customer to that branch with initial transaction
 * Add a transation for an existing customer for that branch
 * Sho a list of customers for aparticular branch and optionally a list of their transactions
 * Demonstration autoboxing and unboxing in your code
 * Hint: Transactions
 * Add data validation
 * e.g. check if exists, or does not exist, etc.
 * Think about where you are adding the code perform certain actions
 */


public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("Bank of Ireland");

        if(bank.addBranch("Green College")){
            System.out.println("Green College branch created");
        }

        bank.addCustomer("Green College", "Thiago Murphy", 100.54);
        bank.addCustomer("Green College", "Caomhan Murphy", 521.22);
        bank.addCustomer("Green College", "Luna Murphy", 452.23);

        bank.addBranch("Arklow");
        bank.addCustomer("Arklow", "Camila Francesco", 50.12);

        bank.addCustomerTransaction("Green College", "Thiago Murphy", 44.22);
        bank.addCustomerTransaction("Green College", "Thiago Murphy", 12.44);
        bank.addCustomerTransaction("Green College", "Caomhan Murphy", 1.65);

        bank.listCustomers("Green College", true);
        bank.listCustomers("Arklow", true);


        bank.addBranch("Bray");

        if(!bank.addCustomer("Bray", "Leandro Andrade", 5.53)){
            System.out.println("Error Bray branch does not exist");
        }

        if(!bank.addBranch("Arklow")){
            System.out.println("Arklow branch already exists");
        }



    }



}
