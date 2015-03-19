package org.usfirst.frc811.RobotCode2015.subsystems;

import org.usfirst.frc811.RobotCode2015.RobotMap;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Kicker extends Subsystem {
	
	//Initialization for the pneumatics
	DoubleSolenoid kickerdoublesolenoid = RobotMap.kickerDoubleSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void out(){
    	kickerdoublesolenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void in(){
    	kickerdoublesolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}
