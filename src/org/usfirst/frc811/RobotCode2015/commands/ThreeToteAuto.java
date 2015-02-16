package org.usfirst.frc811.RobotCode2015.commands;

	import edu.wpi.first.wpilibj.command.CommandGroup;

	public class ThreeToteAuto extends CommandGroup {
		
		
		public ThreeToteAuto() {
			addSequential(new lift_encoder_reset());
			addParallel(new open_claw());
			
			addSequential(new arm_to_up());
			addParallel(new lift_up());
			
			addSequential(new drive_auto(-80));
			
			addSequential(new grab_box());
			
			addSequential(new drive_auto(-80));
			
			addSequential(new grab_box());
			addParallel(new strafe_auto(-110));;
			
			
			
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


