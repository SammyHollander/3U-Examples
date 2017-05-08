
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class countedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City lego = new City();
        //create a robot
        RobotSE karel = new RobotSE(lego, 1, 1, Direction.EAST);

        //make a counter starting at 0
        int counter = 0;
        //move five times using a condition
        while (counter < 5) {
            //move
            karel.move();
            //add 1 to the counter each time karel moves
            counter = counter + 1;


            //counter++; <- shortcut to add one
            //counter--; <-shortcut to subract 1
            //counter += 1; <-shortcut to add the number on other side of=sign
            //++counter; <- shortcut to add 1 (plz don't use)


        }
        //turn karel around
        karel.turnAround();
        //useing a for loop to count
        //for(define a variable; condition to loop; change variable)
        for (int i = 0; i < 5; i = i + 1) {
            karel.move();
        }
        //compound conditions
        // && <- AND statement-both must be true
        // || <- OR statement-one of them must be true
        if (karel.frontIsClear()) {
            if (karel.countThingsInBackpack() == 5) {
                //do something 
            }
        }
        //both of these statements have to be true for this statement to run (fifty of these could be in one if statement...)
        if (karel.frontIsClear() && karel.countThingsInBackpack() == 5) {
            //do something
        }
        //
        if (karel.frontIsClear()) {
            //do something
        } else if (karel.countThingsInBackpack() == 5) {
            //do same thing as above
        }

        //if statement with OR condtion
        if (karel.frontIsClear() || karel.countThingsInBackpack() == 5) {
        }


    }
}
