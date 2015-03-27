package org.usfirst.frc811.RobotCode2015.commands;

import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class lift_fullspeed extends Command implements Config {
	
	public lift_fullspeed() {
		requires(Robot.lift);
		
		setTimeout(3);
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		RobotMap.liftTalon_Left.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	RobotMap.liftTalon_Right.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	
    	RobotMap.liftTalon_Left.set(1);
		RobotMap.liftTalon_Right.set(1);
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
