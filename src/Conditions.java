
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating new city
        City lego = new City();
        
        //makeing a stack of new things
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        new Thing(lego,1,1);
        
        //new robot
        Robot karel = new Robot(lego,1,1,Direction.EAST);
        // make new wall
        new Wall(lego,1,5,Direction.EAST);
        //infinate loop to move and turn left
        while(karel.frontIsClear()){
            karel.move();
            //karel.turnLeft();
            //pick up everything
            if(karel.canPickThing()){
            karel.pickThing();
            //stops the loop
            break;
        }
            //did karel hit a wall (!=ask the opposite)
            //if(!karel.frontIsClear()){
            //did karel hit a wall
            if(karel.frontIsClear() ==false){
                karel.turnLeft();
                
            }
        }
       
        
        }
        
    }
