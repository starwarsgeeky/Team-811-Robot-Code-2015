package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class  lift_up_and_down extends CommandGroup {

	public lift_up_and_down() {
		addSequential(new lift_down());
		addSequential(new lift_up());
	}
	
    
}

