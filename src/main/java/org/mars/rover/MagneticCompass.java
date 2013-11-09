package org.mars.rover;

/**
 * This is a magnetic compass.
 * 
 * @author ross
 */
public enum MagneticCompass implements Compass {
    
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    /**
     * The direction of the compass.
     */
    private String direction;
    
    /**
     * Constructor of the MagneticCompass.
     * 
     * @param direction of the compass.
     */
    private MagneticCompass(String direction) {
        this.direction = direction;
    }
    
    /**
     * Gets the direction of the Compass.
     * 
     * @return the direction of the compass.
     */
    public String direction() {
        return direction;
    }
}
