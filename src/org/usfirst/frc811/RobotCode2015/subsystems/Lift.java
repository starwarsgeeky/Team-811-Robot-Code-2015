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

import org.usfirst.frc811.RobotCode2015.OI;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.commands.moving_lift_w_joysticks;

/**
 *
 */
public class Lift extends Subsystem implements Config {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limit_TopRight = RobotMap.liftLimit_TopRight;
    DigitalInput limit_BottomRight = RobotMap.liftLimit_BottomRight;
    DigitalInput limit_TopLeft = RobotMap.liftLimit_TopLeft;
    DigitalInput limit_BottomLeft = RobotMap.liftLimit_BottomLeft;
    Encoder encoder_Left = RobotMap.liftEncoder_Left;
    Encoder encoder_Right = RobotMap.liftEncoder_Right;
    CANTalon talon_Left = RobotMap.liftTalon_Left;
    CANTalon talon_Right = RobotMap.liftTalon_Right;
    Joystick joystick2 = RobotMap.joystick2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public Lift() { 
    	talon_Left.changeControlMode(CANTalon.ControlMode.Position); //makes it so will go to position when you use .set()
    	talon_Left.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder); //sets device so knows what it's looking for
    	talon_Left.setPID(1.0, 0.0, 0.0); //numbers are temporary
    	talon_Left.enableLimitSwitch(true, true);
    	
    	talon_Right.changeControlMode(CANTalon.ControlMode.Position); //makes it so will go to position when you use .set()
    	talon_Right.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder); //sets device so knows what it's looking for
    	talon_Right.setPID(1.0, 0.0, 0.0); //numbers are temporary
    	talon_Right.enableLimitSwitch(true, true);
    }

    public void initDefaultCommand() {
    
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new moving_lift_w_joysticks());
    }
    
    public void Lift_w_joy() { 
    /*	
    	if (joystick2.getRawAxis(LIFT_JOYSTICK_AXIS) < -0.1) {
    		talon_Right.set(0.3);
    		talon_Left.set(0.3);
    	} else if (joystick2.getRawAxis(LIFT_JOYSTICK_AXIS) > 0.1) {
    		talon_Right.set(-0.3);
    		talon_Left.set(-0.3);
    	} else {
    		talon_Right.set(0.0);
    		talon_Left.set(0.0);
    	}
    	
    	SmartDashboard.putBoolean("left forward limit", RobotMap.liftTalon_Left.isFwdLimitSwitchClosed());
        SmartDashboard.putBoolean("left reverse limit", RobotMap.liftTalon_Left.isRevLimitSwitchClosed());
        SmartDashboard.putBoolean("right forward limit", RobotMap.liftTalon_Right.isFwdLimitSwitchClosed());
        SmartDashboard.putBoolean("right reverse limit", RobotMap.liftTalon_Right.isRevLimitSwitchClosed());
    	SmartDashboard.putString("lift status", "move w/ joy :D");
    	*/
    }
    
    public void LiftUp() {    	
    	talon_Left.set(LIFT_MIN_DISTANCE);
    	talon_Right.set(LIFT_MIN_DISTANCE);
    	
    	SmartDashboard.putString("lift status", "lift down");
    }
    
    public void LiftDown() {
    	talon_Left.set(LIFT_MAX_DISTANCE);
    	talon_Right.set(LIFT_MAX_DISTANCE);
    	
    	SmartDashboard.putString("lift status", "lift up");
    	
    }
    
    public void encoderReset() {
    	talon_Left.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	talon_Right.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	
    	if(! talon_Left.isFwdLimitSwitchClosed()) {
    		talon_Left.set(0.5);
    		//SmartDashboard.putString("is it working?", "yes!");
    	} else {
    		talon_Left.set(0.0);
    		//SmartDashboard.putString("is it working?2", "limit left is it");
    	}
    	if(! talon_Right.isFwdLimitSwitchClosed()) {
    		talon_Right.set(0.5);
    	} else {
    		talon_Right.set(0.0);
    	}

    }
    
    public void encoderResetDone() {
    	
    	talon_Left.setPosition(0);
    	talon_Right.setPosition(0);

    	
    	talon_Left.changeControlMode(CANTalon.ControlMode.Position); //makes it so will go to position when you use .set()
    	
    	talon_Right.changeControlMode(CANTalon.ControlMode.Position); //makes it so will go to position when you use .set()
    }
}
