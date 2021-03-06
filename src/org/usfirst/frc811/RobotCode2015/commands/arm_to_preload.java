package org.usfirst.frc811.RobotCode2015.commands;

import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class arm_to_preload extends Command implements Config {
	
	 public arm_to_preload() {
	        // Use requires() here to declare subsystem dependencies
	        // eg. requires(chassis);

	        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	        requires(Robot.arm);
	        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	RobotMap.armarm_talon.changeControlMode(CANTalon.ControlMode.Position);
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	Robot.arm.moveToPreload();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	    	return (timeSinceInitialized() > .25) && (Math.abs(RobotMap.armarm_talon.getClosedLoopError()) < ARM_END_COMMAND_DIFFERENCE_VALUE); //TODO:
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	RobotMap.armarm_talon.changeControlMode(CANTalon.ControlMode.PercentVbus);
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }

}
