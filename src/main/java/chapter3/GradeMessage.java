package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){

        // 1. Get the test scores
        System.out.println("Enter your letter grade: ");
        Scanner scanner=new Scanner(System.in);
        String grade = scanner.next();

        // 2. Determine the letter grade
        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit hard";
                break;
            case "F":
                message = "uh oh!";
                break;
            default:
                message = "Error. invalid grade";
                break;
        }

        System.out.println(message);
    }
}
