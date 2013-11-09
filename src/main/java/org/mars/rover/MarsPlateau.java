package org.mars.rover;

import java.util.List;

/**
 * This is a Mars plateau and is divided up into a grid to simplify the
 * navigation of Rovers so that their on board cameras can view the surrounding
 * terrain and send the data back to NASA.
 *
 * @author ross
 */
public class MarsPlateau implements Plateau {

    /**
     * A list of Rovers on the MarsPlateau.
     */
    private List<Rover> rovers;
    
    /**
     * This is the constructor for a MarsPlateau.
     * 
     * @param rovers This is default list of Rover's. 
     * @param xAxisSize This is the size of the X axis.
     * @param yAxisSize This is the size of the Y axis.
     */
    public MarsPlateau(List<Rover> rovers, int xAxisSize, int yAxisSize) {
        this.rovers = rovers;
    }

    /**
     * Moves the Rover forward one grid point.
     * 
     * @param roverId The id of the Rover to move.
     */
    @Override
    public void moveRoverForward(long roverId) {
        
        int count = 0;
        
        for (Rover plateauRover : rovers) {
            if(plateauRover.getId() == roverId){
                plateauRover.moveForward();
                rovers.set(count, plateauRover);
            }
            count++;
        }
    }
    
    /**
     * Spins the Rover left 90 degrees.
     * 
     * @param roverId The id of the Rover to spin.
     */
    @Override
    public void spinRoverLeft(long roverId) {

        int count = 0;
        
        for (Rover plateauRover : rovers) {
            if(plateauRover.getId() == roverId){
                plateauRover.spinLeft();
                rovers.set(count, plateauRover);
            }
            count++;
        }
    }
    
    /**
     * Spins the Rover right 90 degrees.
     * 
     * @param roverId The id of the Rover to spin.
     */
    @Override
    public void spinRoverRight(long roverId) {
        
        int count = 0;
        
        for (Rover plateauRover : rovers) {
            if(plateauRover.getId() == roverId){
                plateauRover.spinRight();
                rovers.set(count, plateauRover);
            }
            count++;
        }
    }
    
    /**
     * Gets the Rovers on the MarsPlateau.
     * 
     * @return The Rovers.
     */
    @Override
    public List<Rover> getRovers() {
        return rovers;
    }

    /**
     * Adds a Rover to the MarsPlateau.
     * 
     * @param rover The Rover to add.
     */
    @Override
    public void addRover(Rover rover) {
       rovers.add(rover);
    }

}
