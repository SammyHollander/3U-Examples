
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class stringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
while (true) {
        //get a word from the user
        System.out.println("please enter a word:");
        String word = input.nextLine();
        
        //index of tries to look throught the word and find the character specified in the inputed word and the number of the position that the character is located at
        //try to find the position of an a -> if not found the value is -1
        int aPosition = word.indexOf("a");
        
        //stop the program when end is entered
        if(word.equals("END")){
            break;
        }
        
            //convert to lowercase
            word = word.toLowerCase();

            //fix 1337 (leet) speek
            //changes all 3 to e
            word = word.replace("3", "e");
            //changes all @ to a
            word = word.replace("@", "a");
            //change all 0 to o
            word = word.replace("0", "a");
            //also a command that can replace the first one of something
            //looks like this: word.replaceFirst("smth", "smthing else");


            //figureing out how long the string is and telling the user (spaces count as a character)
            int Length = word.length();
            System.out.println("Your word is " + Length + " characters long.");

            //get the letter at a position (most you can put in is length-1 ->to get the last letter)
            char letter = word.charAt(Length - 1);
            System.out.println("Character at 0 is " + letter);

            //Print out each letter in the word
            //start at position 0 then go up to length-1
            for (int i = 0; i < Length; i++) {
                //get the character at position i
                char character = word.charAt(i);
                //print the character
                System.out.println(character);

                //see if it is a vowel
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    //starting at zero going up to the vowel in the word(makeing a substring)
                    //breaking up the string where the vowel was found
                    String firstHalf = word.substring(0, i);
                    //the second substring thing starts from the perameter, then goes to the end of the word, the first one startes and ends based on the perameter given
                    String lastHalf = word.substring(i);

                    //create the translated word
                    String tWord = lastHalf + firstHalf + "ay";

                    //show the user the Pig Latin
                    System.out.println("Your word in Pig Latin is " + tWord);

                    //stop looking for more vowels
                    break;
                }
            }

        }
    }
}
