package application;

import entities.Currency;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollarPrice;
        double quantityToBeBought;

        System.out.println("What is the dollar price?");
        dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        quantityToBeBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", Currency.converter(dollarPrice, quantityToBeBought));

    }
}
