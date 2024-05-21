package chapter3;

import java.util.Scanner;

//Logical operator
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){

        // 1. Initialize known values
        int requiredSalary = 30000;
        int requiredYearEmployed = 2;

        // 2. Get values for the unknown
        System.out.println("Enter your salary: ");
        Scanner scanner=new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        // 3. Make a decision on the path to take + 4. Output
        if (salary>= requiredSalary && years>= requiredYearEmployed){
                System.out.println("Congrats! You qulify for the loan");
        }
        else {
            System.out.println("Sorry, you must earn at least $"
                    + requiredSalary + " to qualify for the loan");
        }
    }
}
