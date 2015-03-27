// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.RobotMap;
/**
 *
 */
public class  lift_down extends Command implements Config {
	
    public lift_down() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lift);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        setTimeout(3);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.liftTalon_Left.changeControlMode(CANTalon.ControlMode.Position);
    	RobotMap.liftTalon_Right.changeControlMode(CANTalon.ControlMode.Position);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.liftTalon_Left.set(LIFT_MAX_DISTANCE);
    	RobotMap.liftTalon_Right.set(LIFT_MAX_DISTANCE);
    	
    	SmartDashboard.putString("lift status", "lift up");
    	

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return ((timeSinceInitialized() > .25) && (Math.abs(RobotMap.liftTalon_Left.getClosedLoopError()) < LIFT_END_COMMAND_DIFFERENCE_VALUE) &&
    				((Math.abs(RobotMap.liftTalon_Right.getClosedLoopError())) < LIFT_END_COMMAND_DIFFERENCE_VALUE)) || isTimedOut(); //TODO:
    	    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.liftTalon_Left.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	RobotMap.liftTalon_Right.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.liftTalon_Left.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	RobotMap.liftTalon_Right.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	
    	RobotMap.liftTalon_Left.set(0);
    	RobotMap.liftTalon_Right.set(0);
    }
}
