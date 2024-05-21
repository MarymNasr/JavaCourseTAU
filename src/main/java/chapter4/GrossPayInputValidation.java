package chapter4;
//while loop

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]) {

        // 1. Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // 2. Get input for the unknown variables
        System.out.println("How many sales did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // 3. Validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again. ");
            //sentinel
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // 4. Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
