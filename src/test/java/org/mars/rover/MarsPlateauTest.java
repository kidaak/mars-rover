package org.mars.rover;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Test case for the MarsPlateau class.
 * 
 * @author ross
 */
public class MarsPlateauTest extends TestCase {
    
    private Plateau plateau;
    private List<Rover> rovers;
    
    public MarsPlateauTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();   
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Creates a Plateau and two MarsRovers then moves them.
     */
    public void testMarsPlateauCreatesTwoRoversAndMovesThem() {
        rovers = new ArrayList<Rover>();    
        plateau = new MarsPlateau(rovers, 5, 5);
        
        Rover firstRover = new MarsRover(1, 1, 2, MagneticCompass.NORTH);
        
        // Deploy the first Rover.
        
        plateau.addRover(firstRover);
        
        // Expolore the Plateau.
        
        plateau.spinRoverLeft(firstRover.getId());
        plateau.moveRoverForward(firstRover.getId());
        plateau.spinRoverLeft(firstRover.getId());
        plateau.moveRoverForward(firstRover.getId());
        plateau.spinRoverLeft(firstRover.getId());
        plateau.moveRoverForward(firstRover.getId());
        plateau.spinRoverLeft(firstRover.getId());
        plateau.moveRoverForward(firstRover.getId());
        plateau.moveRoverForward(firstRover.getId());
            
        Rover secondRover = new MarsRover(2, 3, 3, MagneticCompass.EAST);
        
        // Deploy the second Rover.
        
        plateau.addRover(secondRover);
        
        // Expolore the Plateau.
        
        plateau.moveRoverForward(secondRover.getId());
        plateau.moveRoverForward(secondRover.getId());
        plateau.spinRoverRight(secondRover.getId());
        plateau.moveRoverForward(secondRover.getId());
        plateau.moveRoverForward(secondRover.getId());
        plateau.spinRoverRight(secondRover.getId());
        plateau.moveRoverForward(secondRover.getId());
        plateau.spinRoverRight(secondRover.getId());
        plateau.spinRoverRight(secondRover.getId());
        plateau.moveRoverForward(secondRover.getId());
        
        // Get their final positions on the Plateau and test that their 
        // coordinates and orientation are correct.
        
        rovers = plateau.getRovers();
        
        Rover thirdRover = rovers.get(0);
        
        assertEquals(1, thirdRover.getXCoordinate());
        assertEquals(3, thirdRover.getYCoordinate());
        assertEquals("N", thirdRover.getCompass().direction());
        
        Rover forthRover = rovers.get(1);
        
        assertEquals(5, forthRover.getXCoordinate());
        assertEquals(1, forthRover.getYCoordinate());
        assertEquals("E", forthRover.getCompass().direction());   
    }
}
