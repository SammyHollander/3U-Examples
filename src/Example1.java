
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener
        City kitchener = new City();
        
        //creating a robot, starfire, starting on street 2, avenue 1, facing east
        Robot starfire = new Robot(kitchener, 2, 1, Direction.EAST);
        starfire.move();
        starfire.turnLeft();
        
    }
}
