
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debia7331
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Making a city 
        City kw = new City();
        
        // Making robots
       Robot bob = new Robot(kw, 0, 0, Direction.SOUTH);
       Robot bobby = new Robot(kw, 0, 1, Direction.SOUTH);
       
       // Making new walls 
       new Wall(kw, 0, 1, Direction.WEST);  
       new Wall(kw, 1, 1, Direction.WEST);
       new Wall(kw, 1, 1, Direction.SOUTH);
       
       // Making bob and boboy move
       bob.move();
       bobby.move();
       bob.move();
       bobby.turnLeft();
       bob.turnLeft();
       bobby.move();
       bobby.turnLeft();
       bobby.turnLeft();
       bobby.turnLeft();
       bobby.move();
       bobby.turnLeft();
       bobby.turnLeft();
       bobby.turnLeft();
       bob.move();
       bobby.move();
        
        
        
    }
}
