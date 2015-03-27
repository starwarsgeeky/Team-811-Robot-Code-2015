package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class strafe_then_drive extends CommandGroup {
	
	public strafe_then_drive() {
		addSequential(new strafe_auto(-29));
		addSequential(new drive_auto(-40));
		addSequential(new strafe_auto(30));
	}
	
}
