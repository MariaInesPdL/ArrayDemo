package arraydemo;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        
     /*   char[] myLetters = new char[5];
        
        myLetters[0] = 'M';
        myLetters[1] = 'a';
        myLetters[2] = 'r';
        myLetters[3] = 'i';
        myLetters[4] = 'a';
        
        for(int i = 0; i < myLetters.length; i++){
            System.out.print(myLetters[i]);
        }*/
     System.out.println("Enter word: ");
     Scanner input = new Scanner(System.in);
     String myWord = input.nextLine();
     char[] myLetters = new char[myWord.length()];
     
     for(int i=0; i<myLetters.length; i++){
         myLetters[i] = myWord.charAt(i);
         System.out.print(myLetters[i]);
     }
        System.out.println("Printing in reverse: ");
     for(int i=myLetters.length-1 ; i>=0; i-- )
         System.out.print(myLetters[i]);
    }
    
}
