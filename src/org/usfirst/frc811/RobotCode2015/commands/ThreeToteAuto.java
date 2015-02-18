package org.usfirst.frc811.RobotCode2015.commands;

	import edu.wpi.first.wpilibj.command.CommandGroup;

	public class ThreeToteAuto extends CommandGroup {
		
		
		public ThreeToteAuto() {
			addSequential(new lift_encoder_reset());
			addSequential(new close_claw());
			
			addParallel(new arm_to_up());
			addParallel(new lift_up());
			addSequential(new wait(.8));
			addSequential(new drive_auto(-77));
			
			addSequential(new lift_down());
			addSequential(new lift_encoder_reset());
			
			addParallel(new lift_slightly_higher());
			addSequential(new wait(1.26));
			addSequential(new open_claw());
			
			addSequential(new drive_auto(-77));
			addSequential(new close_claw());
			
			addParallel(new strafe_auto(-98));
			
			addSequential(new lift_down());
			addSequential(new drive_auto (20));
			
			
			
			/*addSequential(new lift_encoder_reset());
			//move forward
			addSequential(new drive_auto(-17));
			//pick up tote
			addSequential(new grab_box());
			//move forward and hopefully not crash into a container / another robot
			addSequential(new drive_auto(-17));
			//pick up tote
			addSequential(new grab_box());
			//move forward and hopefully not crash into a container / another robot
			addSequential(new drive_auto(-17));
			//pick up tote
			addSequential(new grab_box());
			//strafe left
			addSequential(new strafe_auto(-110));
			//drop tote stack
			addSequential(new lift_down());
			//back away from stack and stay in autozone
			addSequential(new back_up());
			//done
			 */
			 
		
		}
		
	}


