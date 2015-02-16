package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class JustDriveAuto extends CommandGroup {
	
	
	public JustDriveAuto() {
		addSequential(new lift_encoder_reset());
		//move forward
		addSequential(new drive_auto(-17));
		//done
	
	
	}
}