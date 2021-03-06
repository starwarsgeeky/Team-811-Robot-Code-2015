package org.usfirst.frc811.RobotCode2015.commands;

import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class lift_to_preload extends Command implements Config {
	
    public lift_to_preload() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lift);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        setTimeout(2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.liftTalon_Left.changeControlMode(CANTalon.ControlMode.Position);
    	RobotMap.liftTalon_Right.changeControlMode(CANTalon.ControlMode.Position);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.liftTalon_Left.set(LIFT_PRELOAD_DISTANCE);
    	RobotMap.liftTalon_Right.set(LIFT_PRELOAD_DISTANCE);
    	
    	SmartDashboard.putString("lift status", "lift to preload");
    	

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
