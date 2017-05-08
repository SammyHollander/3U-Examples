
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int num = 5;
        System.out.println("Hello World " + num); 
        
        String name = "Sam";
        System.out.println(name);
        
        Scanner input = new Scanner(System.in);
        String name2 = input.nextLine();
        System.out.println("you typed " + name2);
        
        double num1 = input.nextDouble();
        int num2 = input.nextInt();
        double sum = num2 + num1;
        System.out.println("total =" +sum);
    }
}
