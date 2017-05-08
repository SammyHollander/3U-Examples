
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //create a list of 5 numbers
        double[] marks = new double[5];

        //Scan in some marks
        System.out.println("Please enter " + marks.length + " marks");
//        //THIS IS THE BAD WAY!!!
//        //put a number in the first position
//        marks[0] = input.nextDouble();
//        //put a number in the second position
//        marks[1] = input.nextDouble();
//        //...so on and so on...for each space in the array
//        marks[2] = input.nextDouble();
//        marks[3] = input.nextDouble();
//        marks[4] = input.nextDouble();

        //THIS IS THE GOOD WAY!!
        //use a for loop
        for (int i = 0; i < marks.length; i++) {
            //scan in number of numbers equal to the length of the array
            marks[i] = input.nextDouble();

        }
        //use a for loop to determine the sum
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add whatever number it's on to the sum
            sum = sum + marks[i];
        }
        System.out.println("");
        System.out.println("The sum is " +sum);
        
        //caculate averate
        double avg = sum/marks.length;
        System.out.println("Average is " + avg);
        
        //print the array again
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //enhanced for loop-EXTRA
        for(double num:marks){
            System.out.println(num);
        }
    }
}
