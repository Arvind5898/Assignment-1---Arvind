
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a new city 
        City kw = new City();
        
        //Making a new Thing 
        new Thing(kw, 3, 1);
        
        //Making a new robot 
        Robot bob = new Robot(kw, 3, 0, Direction.EAST);
        
        //making new walls
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        
        //Making bob move 
        bob.move();
        
        //Making bob pick up the flag 
        bob.pickThing();
        
        //Moaking bob climb(move)
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        
        //Making bob drop the thing 
        bob.putThing();
        
        //Making bob move again
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        
        
                
        
        
    }
}
