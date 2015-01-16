package org.usfirst.frc.team811.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DoubleSolenoid;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
	DoubleSolenoid thing; 
	Joystick joy1;
	
    public void robotInit() {
    	thing = new DoubleSolenoid(1,2);
    	joy1 = new Joystick(1);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	thing.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	if (joy1.getRawButton(1)) {
    		thing.set(DoubleSolenoid.Value.kReverse);
    	} else if (joy1.getRawButton(2)) {
    		thing.set(DoubleSolenoid.Value.kForward);
    	}
    	
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
