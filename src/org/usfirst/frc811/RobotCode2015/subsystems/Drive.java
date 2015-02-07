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
import org.usfirst.frc811.RobotCode2015.RobotMap;
import org.usfirst.frc811.RobotCode2015.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem implements Config {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Gyro gyro1 = RobotMap.driveGyro1;
    SpeedController frontright = RobotMap.drivefrontright;
    SpeedController frontleft = RobotMap.drivefrontleft;
    SpeedController backleft = RobotMap.drivebackleft;
    SpeedController backright = RobotMap.drivebackright;
    RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;
    Encoder drive_encoder = RobotMap.drivedrive_encoder;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new drive_w_joysticks());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveWithJoy() {
    	
    	if (Math.abs(joy1.getRawAxis(DRIVE_STRAFING_JOYSTICK_AXIS)) <= 0.1){
    		strafe = true;
    		correction = 0;
    	}
    	if (Math.abs(joy1.getRawAxis(DRIVE_STRAFING_JOYSTICK_AXIS)) >= 0.3 && strafe ) {
    		double angle = gyro1.getAngle();
    		gyro1.reset();
    		strafe = false;
    	}
    	 
    	if (Math.abs(joy1.getRawAxis(DRIVE_STRAFING_JOYSTICK_AXIS)) >= 0.3) {
    		correction = gyro1.getAngle();
    	}
    	
    	
    	robotDrive41.mecanumDrive_Cartesian(joy1.getRawAxis(DRIVE_STRAFING_JOYSTICK_AXIS) * -1, joy1.getRawAxis(DRIVE_Y_JOYSTICK_AXIS) * -1, (joy1.getRawAxis(DRIVE_X_JOYSTICK_AXIS) + correction) * -1, 0);
    

    }
    
    public void driveAuto() {
    	drive_encoder.start();
    	int count = drive_encoder.get();
        if (count ==  /*Counts per Rotation*/) {
        	drive_encoder.reset();
        	robotDrive41.drive.mecanumDrive_Cartesian(0, 0, 0, 0);
        } else {
        	robotDrive41.drive.mecanumDrive_Cartesian(0, DEFAULT_SPEED_SCALE, 0, 0);
        }
    }
    
    public void strafeAuto() {
    	
    }
    
    public void backUp() {
    	drive_encoder.start();
    	int count = drive_encoder.get();
        if (count ==  /*negative Counts per Rotation*/) {
        	drive_encoder.reset();
        	robotDrive41.drive.mecanumDrive_Cartesian(0, 0, 0, 0);
        } else {
        	robotDrive41.drive.mecanumDrive_Cartesian(0, -DEFAULT_SPEED_SCALE, 0, 0);
        }
    }
}

