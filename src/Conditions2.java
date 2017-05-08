
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city called lego
        City lego = new City();
       
        
        //create a robot in city lego
        Robot karel = new Robot(lego,4,1,Direction.EAST);
        
        //create path
        new Thing(lego,4,2);
       
        new Thing(lego,4,3);
        new Thing(lego,4,3);
        
        new Thing(lego,3,3);
        
        new Thing(lego,2,3);
        new Thing(lego,2,3);
        new Thing(lego,2,3);
        new Thing(lego,2,3);
        //turn on the thing labels
        lego.showThingCounts(true);
        //step onto the first part fo the path
        karel.move();
        
        //looop
        while(true){
        //if there are things, pick them all up
            while(karel.canPickThing()){
                karel.pickThing();
            }
            
            
        //count things in backpack
        if(karel.countThingsInBackpack()== 1){
        //drop things
            karel.putThing();
            //move
            karel.move();
            //if holding two things, turn left
        }else if(karel.countThingsInBackpack()==2){
           //drop things
           karel.putThing();
           karel.putThing();
           //move
           karel.turnLeft();
           karel.move();
       //if holding 3 things, turn right
       }else if(karel.countThingsInBackpack()==3){
           //drop things
           karel.putThing();
           karel.putThing();
           karel.putThing();
           //move
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft();
           karel.move();
       }else if(karel.countThingsInBackpack()==4){
           //drop things
           karel.putThing();
           karel.putThing();
           karel.putThing();
           karel.putThing();
           //end of path
           break;
        //if holding 4 things, stop
        }
       }
        }   
    }

