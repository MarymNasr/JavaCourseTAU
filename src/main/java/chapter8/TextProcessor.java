package chapter8;

public class TextProcessor {

    public static void main(String[] args){
        countWords("My Name Is Agmad Tester Marym Nasr");
        reverseString("Reverse me Please!");
        addSpaces("KolDaKanLeh?");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full String to be split
     */
    public static void countWords(String text){
        var words= text.split(" ");
        int numberOfWords = words.length;
        // %d is a placeholder for a number

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i=0 ; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i= text.length()-1; i>=0 ; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds space before each uppercase letter
     * @param text jumbed text
     */
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for (int i=0 ; i<modifiedText.length() ; i++){
            //Character is wrapper class
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert( i , " ");
                i++;
            }
        }
        System.out.println( modifiedText );

    }

}
