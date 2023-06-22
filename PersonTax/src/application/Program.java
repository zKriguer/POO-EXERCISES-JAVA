package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char personType = sc.next().charAt(0);

            if (personType == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                persons.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();

                persons.add(new Company(name, anualIncome, employeesNumber));
            }
        }
        double totalTaxes = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        
        for (TaxPayer person : persons) {
            System.out.printf("%s, %.2f", person.getName() + ": $", person.tax());
            totalTaxes += person.tax();
        }

        System.out.println("TOTAL TAXES: $ " + totalTaxes);
    }
}
