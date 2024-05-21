package chapter3;
//IF else

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){

        // 1. Initialize known values
        int quota =10;

        // 2. Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner=new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // 3. Make a decision on the path to take + 4. Output
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not ve met your quota. You were " + salesShort + " sales short");
        }
    }

}
