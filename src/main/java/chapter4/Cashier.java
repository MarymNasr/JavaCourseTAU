package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {

        // 1. Get number of item to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        // 2. Create loop to iterate through all of the items and accumulate the costs
        for(int i = 0 ; i < quantity ; i++){

            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();

            total = total + price;
        }
        System.out.println("Your total is $" + total);
        scanner.close();
    }
}
