// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc811.RobotCode2015.subsystems;

import org.usfirst.frc811.RobotCode2015.RobotMap;
import org.usfirst.frc811.RobotCode2015.commands.*;
import org.usfirst.frc811.RobotCode2015.commands.move_arm_w_joystick;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    AnalogPotentiometer  Potentiometer = RobotMap.armPotentiometer;
    CANTalon arm_talon = RobotMap.armarm_talon;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new move_arm_w_joystick());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void getPotReading() {
    	arm_talon.getSensorPosition(Potentiometer);
    }
    
    public void setPotOnCanTalon() {
    	arm_talon.setFeedbackDevice(Potentiometer);
    }
    
    public void setPotDownValue() {
    	arm_talon.set(.1); //????
    }
    
    public void moveToDown() {
    	double setpoint = arm_talon.getSetpoint();
    	//go to setpoint??
    }
    
    public void move_arm_w_joystick() {
    	double maxdistance = 5;
    	double mindistance = 0;
    	
    	if (arm_talon.getDistance() >   maxdistance && joystick2.getRawAxis > 0) {
			arm_talon.set(0);
		} else {
			arm_talon.set(joystick2.getRawAxis * .1);
		}
		if (arm_talon.getDistance() < mindistance && joystick2.getRawAxis < 0) {
			 arm_talon.set(0);
		 } else {
			arm_talon.set(joystick2.getRawAxis * .1);
		}
		 
    }
}

