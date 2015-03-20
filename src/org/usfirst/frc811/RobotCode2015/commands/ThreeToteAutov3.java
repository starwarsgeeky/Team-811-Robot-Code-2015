package org.usfirst.frc811.RobotCode2015.commands;

	import edu.wpi.first.wpilibj.command.CommandGroup;

	public class ThreeToteAutov3 extends CommandGroup {
		
		
		public ThreeToteAutov3() {
			addParallel(new arm_to_preload());
			addSequential(new lift_encoder_reset());
			addSequential(new close_claw());
			addParallel(new lift_up());
			addSequential(new wait(1));
			addSequential(new turn_auto(30)); // temp value
			addSequential(new open_claw());
			addSequential(new turn_auto(-30)); // temp value
			addSequential(new arm_to_preload());
			addSequential(new drive_auto(-77));
			addParallel(new lift_up());
			addSequential(new wait(1));
			addSequential(new turn_auto(30)); // temp value
			addSequential(new open_claw());
			addSequential(new turn_auto(-30)); // temp value
 			addSequential(new drive_auto(-77));
			addSequential(new strafe_auto(-110));
	}
		
}
	