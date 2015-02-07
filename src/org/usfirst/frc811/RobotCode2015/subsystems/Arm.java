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

import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.OI;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc811.RobotCode2015.RobotMap;
import org.usfirst.frc811.RobotCode2015.commands.move_arm_w_joystick;

/**
 *
 */
public class Arm extends Subsystem implements Config{
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//	AnalogPotentiometer armPotentiometer = RobotMap.armPotentiometer;
    CANTalon arm_talon = RobotMap.armarm_talon;
    Joystick joystick2 = OI.joystick2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void Arm() {
    	arm_talon.changeControlMode(CANTalon.ControlMode.Position); //makes it so will go to position when you use .set()
    	arm_talon.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogPot); //sets device so knows what it's looking for
    	arm_talon.setPID(1.0, 0.0, 0.0); //numbers are temporary
    	arm_talon.setForwardSoftLimit(ARM_TALON_FORWARD_SOFT_LIMIT); //put in number - like a limit switch
    	arm_talon.setReverseSoftLimit(ARM_TALON_REVERSE_SOFT_LIMIT); //put in number - like ^^
    	arm_talon.enableForwardSoftLimit(true);
    	arm_talon.enableReverseSoftLimit(true);
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new move_arm_w_joystick());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
        //arm_talon.setPID(0.1, 0.1, 0.1); // Temp numbers
    }
    
    public void moveToNoodle() {
    	arm_talon.set(ARM_TO_NOODLE_SETPOINT);
    }
    
    public void moveToDown() {
    	arm_talon.set(ARM_TO_DOWN_SETPOINT);
    }
    
    public void moveToUp() {
    	arm_talon.set(ARM_TO_UP_SETPOINT);
    }
    
    public void move_arm_w_joystick() {
		if (arm_talon.get() > ARM_MAX_DISTANCE && joystick2.getRawAxis(ARMS_MOVEMENT_JOYSTICK_AXIS) > 0) {
			arm_talon.set(ARM_MAX_DISTANCE);
		} else {
			arm_talon.set(joystick2.getRawAxis(ARMS_MOVEMENT_JOYSTICK_AXIS) * .1);
		}
		if (arm_talon.get() < ARM_MIN_DISTANCE && joystick2.getRawAxis(ARMS_MOVEMENT_JOYSTICK_AXIS) < 0) {
			 arm_talon.set(ARM_MIN_DISTANCE);
		 } else {
			arm_talon.set(joystick2.getRawAxis(ARMS_MOVEMENT_JOYSTICK_AXIS) * .1);
		}
		 
    }

}

