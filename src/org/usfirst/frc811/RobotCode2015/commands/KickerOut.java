package org.usfirst.frc811.RobotCode2015.commands;

import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class KickerOut extends Command {

    public KickerOut() {
    	requires(Robot.kick);
    	setTimeout(0.3);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    Robot.kick.out();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
