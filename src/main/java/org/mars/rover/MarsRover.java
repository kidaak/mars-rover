package org.mars.rover;

/**
 * This is a Mars Rover and is used for viewing surrounding terrain via on
 * board cameras to send back to NASA.
 * 
 * @author ross
 */
public class MarsRover implements Rover {

    /**
     * The id of the Rover.
     */
    private long            id;
    
    /**
     * The MagneticCompass of the Rover.
     */
    private MagneticCompass magneticCompass;
    
    /**
     * The Rovers current x coordinate.
     */
    private int             xCoordinate;
    
    /**
     * The Rovers current y coordinate.
     */
    private int             yCoordinate;
    
    
    /**
     * Constructor for the MarsRover.
     * 
     * @param id The id of the MarsRover.
     * @param xCoordinate The x coordinate of the MarsRover.
     * @param yCoordinate The y coordinate of the MarsRover.
     * @param magneticCompass The MagneticCompass of the MarsRover.
     */
    public MarsRover
            (long id, int xCoordinate, int yCoordinate, MagneticCompass magneticCompass) {
        this.id = id;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.magneticCompass = magneticCompass;
    }
    
    /**
     * Spins the Rover 90 degrees to the left.
     */
    @Override
    public void spinLeft() {
        if(magneticCompass.direction().equals(MagneticCompass.NORTH.direction())){
            magneticCompass = MagneticCompass.WEST;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.EAST.direction())){
            magneticCompass = MagneticCompass.NORTH;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.SOUTH.direction())){
            magneticCompass = MagneticCompass.EAST;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.WEST.direction())){
            magneticCompass = MagneticCompass.SOUTH;
        }
    }

    /**
     * Spins the Rover 90 degrees to the right.
     */
    @Override
    public void spinRight() {
        if(magneticCompass.direction().equals(MagneticCompass.NORTH.direction())){
            magneticCompass = MagneticCompass.EAST;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.EAST.direction())){
            magneticCompass = MagneticCompass.SOUTH;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.SOUTH.direction())){
            magneticCompass = MagneticCompass.WEST;
        }
        else if(magneticCompass.direction().equals(MagneticCompass.WEST.direction())){
            magneticCompass = MagneticCompass.NORTH;
        }
    }

    /**
     * Moves the Rover forward one grid point.
     */
    @Override
    public void moveForward() {
        if(magneticCompass.direction().equals(MagneticCompass.NORTH.direction())){
            yCoordinate++;
        } else if (magneticCompass.direction().equals(MagneticCompass.EAST.direction())) {
            xCoordinate++;
        } else if (magneticCompass.direction().equals(MagneticCompass.SOUTH.direction())) {
            yCoordinate--;
        } else if (magneticCompass.direction().equals(MagneticCompass.WEST.direction())) {
            xCoordinate--;
        }   
    }

    /**
     * Gets the MarsRovers x coordinate.
     * 
     * @return the x coordinate.
     */
    @Override
    public int getXCoordinate() {
        return xCoordinate;
    }

    /**
     * Gets the MarsRovers y coordinate.
     *
     * @return the y coordinate.
     */
    @Override
    public int getYCoordinate() {
        return yCoordinate;
    }

    /**
     * Gets the MarsRovers magnetic compass.
     * 
     * @return a MagneticCompass.
     */
    @Override
    public MagneticCompass getCompass() {
        return magneticCompass;
    }
    
    /**
     * Gets the MarsRovers id.
     * 
     * @return The id of the MarsRover.
     */
    @Override
    public long getId() {
        return id;
    }
    
}
