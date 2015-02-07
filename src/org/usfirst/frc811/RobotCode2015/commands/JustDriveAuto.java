package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class JustDriveAuto extends CommandGroup {
	
	
	public JustDriveAuto() {
	//move forward
	addSequential(new drive_auto());
	//done
	
	
	}
}