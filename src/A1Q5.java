
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
 * @author debia7331
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Making a city 
        City kw = new City();
        
        // Making robots
        Robot bob = new Robot(kw, 0, 1, Direction.WEST);
        Robot Gugu = new Robot(kw, 3, 3, Direction.EAST);
        
        // Creating a wall
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        // Creating things
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        
        // Making bob and Gugu move
        bob.move();
        Gugu.turnLeft();
        Gugu.turnLeft();
        bob.pickThing();
        bob.turnLeft();
        Gugu.move();
        Gugu.turnLeft();
        Gugu.turnLeft();
        Gugu.turnLeft();
        bob.move();
        bob.pickThing();
        Gugu.move();
        Gugu.pickThing();
        bob.turnLeft();
        Gugu.move();
        Gugu.pickThing();
        Gugu.turnLeft();
        bob.move();
        bob.pickThing();
        
        
        
        
        
        
        
        
            
    }
}
