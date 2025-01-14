package chapter4;

import java.util.Scanner;

//loop break
public class LetterSearch {
    public static void main(String args[]) {

        // 1. Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();


        // 2. Search text for letter A
        boolean letterFound = false;

        for(int i = 0 ; i < text.length() ; i++){
            char currentLetter = text.charAt(i);

            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }

}
