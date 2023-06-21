package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        //OVERRIDE PRACTICE

        Account accDefault = new Account(1005, "Alex", 1000.0);
        accDefault.withDraw(200);
        System.out.println("accDefault = " + accDefault.getBalance());

        Account accSaving = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
        accSaving.withDraw(200);
        System.out.println("accSaving = " + accSaving.getBalance());

        Account accBusiness = new BusinessAccount(1007, "Richard", 1000.0, 1000.0);
        accBusiness.withDraw(200);
        System.out.println("accBusiness = " + accBusiness.getBalance());
    }


}
