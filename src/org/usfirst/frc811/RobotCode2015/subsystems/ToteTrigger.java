package org.usfirst.frc811.RobotCode2015.subsystems;

import org.usfirst.frc811.RobotCode2015.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ToteTrigger extends Trigger {
	
	DigitalInput Back_Trigger = RobotMap.liftBack_Trigger;
    
    public boolean get() {
        return Back_Trigger.get();
    }
}
