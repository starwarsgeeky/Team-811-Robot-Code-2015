package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.Command;

public class wait extends Command {
	
	double seconds;
	
	public wait(double time) {
		seconds = time;
		
	}
	
	public void initialize() {
		
	}
	
	public void execute() {
		
	}
	
	public boolean isFinished() {
		return timeSinceInitialized() > seconds;
	}
	
	public void end() {
		
	}
	
	public void interrupted() {
		
	}
}
