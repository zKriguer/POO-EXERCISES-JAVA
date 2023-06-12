package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products do you want to calculate the average price? ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++){
            System.out.println("What is the product name? ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("What is the product price? ");
            double price = sc.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int j = 0; j < products.length; j++){
            sum += products[j].getPrice();
        }
        double averagePrice = sum / products.length;
        System.out.printf("AVERAGE PRICE: %.2f", averagePrice);
    }
}
