package application;

import entities.AccountDataUser;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountDataUser account;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        if(response == 'y') {
            System.out.println("Enter the initial deposit value");
            double initialDeposit = sc.nextDouble();
            account = new AccountDataUser(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new AccountDataUser(accountNumber, accountHolder);
        };

        System.out.println("Account data: " + account);

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println("Updated data: " + account);

        System.out.println("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Updated data: " + account);

        sc.close();
    }
}
