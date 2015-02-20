package org.usfirst.frc811.RobotCode2015.commands;

import org.usfirst.frc811.RobotCode2015.Robot;
import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneToteAuto extends CommandGroup {
	
	
	public OneToteAuto() {
		//addSequential(new close_claw());
		addParallel(new close_claw());
		addSequential(new lift_encoder_reset());
		
		addParallel(new arm_to_up());
		addSequential(new lift_up());
		//addSequential(new drive_auto(-80));
		//addSequential(new grab_box());
		addSequential(new strafe_auto(-110));
		//move forward
		
		//pick up tote
//		addSequential(new grab_box());
		//move forward and hopefully not crash into a container / another robot
//		addSequential(new drive_auto());
		//strafe left
//		addSequential(new strafe_auto());
		//drop tote stack
//		addSequential(new lift_down());
		//back away from stack and stay in autozone
//		addSequential(new back_up());
		//done
	
	}
	
}