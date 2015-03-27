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

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc811.RobotCode2015.Config;
import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

/**
 *
 */
public class  strafe_auto extends Command implements Config {
	
	private double error;
	private double distance;
	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    public strafe_auto(int inches) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);
        distance = inches;
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(5);
      	
  	   	RobotMap.pid = new PIDController(1, .6, 3, new PIDSource() { public double pidGet() {
  	   	SmartDashboard.putNumber("Auto value", RobotMap.drivedrive_encoder.getDistance());
  	   		return RobotMap.drivedrive_encoder.getDistance();
   		}},
   		new PIDOutput() { public void pidWrite(double d) {
   			double gyro = RobotMap.driveGyro1.getAngle() * -0.05;
   			RobotMap.driveRobotDrive41.mecanumDrive_Cartesian(-d, 0, gyro, 0);
   			SmartDashboard.putString("drive status", "in pidloop for driving");
   			SmartDashboard.putNumber("gyro double", gyro);
  		}});
  	   	RobotMap.drivedrive_encoder.reset();
        RobotMap.drivedrive_encoder.setDistancePerPulse(1/21.75);

  	  	RobotMap.pid.setAbsoluteTolerance(1);
   		RobotMap.pid.setSetpoint(distance); //negative value will go to the robot's right //-110
   		RobotMap.pid.setOutputRange(-1, 1);
   		RobotMap.pid.setContinuous(false);
   		RobotMap.pid.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return RobotMap.pid.onTarget() || isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.driveRobotDrive41.mecanumDrive_Cartesian(0, 0, 0, 0);
    	RobotMap.pid.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.driveRobotDrive41.mecanumDrive_Cartesian(0, 0, 0, 0);
    	RobotMap.pid.disable();
    }
}
