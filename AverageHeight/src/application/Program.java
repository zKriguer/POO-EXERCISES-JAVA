package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many people do you want to take de average height? ");
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++){
        System.out.println("Enter the height: ");
        vect[i] = sc.nextDouble();
    };

    double sum = 0;

    for (int i = 0; i < vect.length; i++){
        sum += vect[i];
    }

    double averageHeight = sum / vect.length;

        System.out.printf("Average Height: %.2f: ", averageHeight);
    sc.close();
    }
}
