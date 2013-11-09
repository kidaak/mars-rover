package org.mars.rover;

/**
 * This is a generic Rover and is used for viewing surrounding terrain via on
 * board cameras to send back to NASA.
 *  
 * @author ross
 */
public interface Rover {
    
    /**
     * Spins the Rover 90 degrees to the left.
     */
    public void spinLeft();
    
    /**
     * Spins the Rover 90 degrees to the right.
     */
    public void spinRight();
    
    /**
     * Moves the Rover forward one grid point.
     */
    public void moveForward();
    
    /**
     * Gets the Rovers x coordinate.
     * 
     * @return the x coordinate.
     */
    public int getXCoordinate();
    
    /**
     * Gets the Rovers y coordinate.
     *
     * @return the y coordinate.
     */
    public int getYCoordinate();
    
    /**
     * Gets the Rovers magnetic compass.
     * 
     * @return a MagneticCompass .
     */
    public MagneticCompass getCompass();
    
    /**
     * Gets the id of the Rover.
     * 
     * @return The id of the Rover. 
     */
    public long getId();
}
