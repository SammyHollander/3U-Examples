
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class MethodsExample {
    
    //method to say hello
    public static void sayHello(){
        System.out.println("Hello!");
    }
    //say hello to a specific person
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    //volume of a cilender calculator
    public static double cylenderVolume(double radius, double height){
        double volume = height*(Math.PI*(Math.pow(radius, 2)));
        return volume;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input= new Scanner(System.in);
        //calling the sayHello method
        sayHello();
        //asks the user to enter their name
        System.out.println("Please enter your name");
        //call the sayHello method to the person
        sayHello(input.nextLine());
        
        //or-can manually put it in here
        String n = "Fread";
        sayHello(n);
        
        sayHello("bob");
    }
}
