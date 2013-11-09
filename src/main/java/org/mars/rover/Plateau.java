package org.mars.rover;

import java.util.List;

/**
 * This is a generic plateau and is divided up into a grid to simplify the
 * navigation of Rovers so that their on board cameras can view the surrounding
 * terrain and send the data back to NASA.
 *
 * @author ross
 */
public interface Plateau {
       
    /**
     * Moves the Rover forward on the Plateau.
     * 
     * @param roverId the id of Rover to move forward.
     */
    public void moveRoverForward(long roverId);
    
    /**
     * Spins the Rover 90 degrees to the left.
     * 
     * @param roverId the id of the Rover to spin 90 degrees to the left.
     */
    public void spinRoverLeft(long roverId);
    
    /**
     * Spins the Rover 90 degrees to the right.
     * 
     * @param roverId the id of the Rover to spin 90 degrees to the right.
     */
    public void spinRoverRight(long roverId);
    
    /**
     * Adds a Rover to the plateau.
     * 
     * @param rover the Rover to be added.
     */
    public void addRover(Rover rover);
    
    /**
     * This is a list of Rovers on the Plateau.
     * 
     * @return A list of Rovers on the Plateau. 
     */
    public List<Rover> getRovers();
}
