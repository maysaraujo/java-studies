package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dollar price?: ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought?: ");
        double quantity = sc.nextDouble();

        double conversor = CurrencyConverter.conversor(dollar, quantity);

        System.out.printf("Amount to be paid in reais = %.2f\n", conversor);
    }
}




