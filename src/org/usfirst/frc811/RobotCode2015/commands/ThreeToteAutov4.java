package org.usfirst.frc811.RobotCode2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ThreeToteAutov4 extends CommandGroup {
	
	public ThreeToteAutov4() { 

	//addParallel(new close_claw());
	addSequential(new lift_encoder_reset());
	
	
	addParallel(new arm_to_up());
	addParallel(new drive_auto(-7));
	addParallel(new lift_up());
	addSequential(new wait(.5));
	
	addSequential(new drive_auto(-75));
	
	addSequential(new lift_down());
	
	//addParallel(new open_claw());
	addParallel(new lift_fullspeed());
	addSequential(new strafe_then_drive());
	//addSequential(new strafe_auto(-29));
	
	//addSequential(new drive_auto(-40));
	
	//addSequential(new strafe_auto(30));
	
	addSequential(new drive_auto(-35));
	
	addParallel(new strafe_auto(-98));
	addSequential(new lift_down());
	
	addSequential(new drive_auto (20));
	
	}
	
	
}
