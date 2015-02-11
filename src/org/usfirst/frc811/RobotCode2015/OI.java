// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc811.RobotCode2015;

import org.usfirst.frc811.RobotCode2015.commands.*;
import org.usfirst.frc811.RobotCode2015.subsystems.ToteTrigger;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI implements Config {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton field_centric_button;
    public JoystickButton robot_centric_button;
    public static Joystick joystick1;
    public JoystickButton claw_open_button;
    public JoystickButton claw_close_button;
    public JoystickButton arm_to_up_button;
    public JoystickButton arm_to_pickup_button;
    public JoystickButton arm_to_noodle_button;
    public static Joystick joystick2;
    public Trigger get_box_trigger;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick2 = new Joystick(1);
        
        arm_to_noodle_button = new JoystickButton(joystick2, ARM_NOODLE_BUTTON);
        arm_to_noodle_button.whenPressed(new arm_to_noodle());
        arm_to_pickup_button = new JoystickButton(joystick2, ARM_DOWN_BUTTON);
        arm_to_pickup_button.whenPressed(new arm_to_pickup());
        arm_to_up_button = new JoystickButton(joystick2, ARM_UP_BUTTON);
        arm_to_up_button.whenPressed(new arm_to_up());
        claw_close_button = new JoystickButton(joystick2, CLAW_CLOSE_BUTTON);
        claw_close_button.whenPressed(new close_claw());
        claw_open_button = new JoystickButton(joystick2, CLAW_OPEN_BUTTON);
        claw_open_button.whenPressed(new open_claw());
        joystick1 = new Joystick(0);

        get_box_trigger = new ToteTrigger();
        get_box_trigger.whenActive(new grab_box());      
        
        
	    
        // SmartDashboard Buttons

        SmartDashboard.putData("drive_w_joysticks", new drive_w_joysticks());

        SmartDashboard.putData("drive_auto", new drive_auto());

        SmartDashboard.putData("strafe_auto", new strafe_auto());

        SmartDashboard.putData("open_claw", new open_claw());

        SmartDashboard.putData("close_claw", new close_claw());

        SmartDashboard.putData("move_arm_w_joystick", new move_arm_w_joystick());

        SmartDashboard.putData("arm_to_up", new arm_to_up());

        SmartDashboard.putData("arm_to_pickup", new arm_to_pickup());

        SmartDashboard.putData("arm_to_noodle", new arm_to_noodle());

        SmartDashboard.putData("lift_up", new lift_up());

        SmartDashboard.putData("lift_down", new lift_down());

        SmartDashboard.putData("grab_box", new grab_box());
        
        SmartDashboard.putData("back up", new back_up());
        
        SmartDashboard.putData("Just drive auto", new JustDriveAuto());
        
        SmartDashboard.putData("lift encoder reset", new lift_encoder_reset());
        
        SmartDashboard.putData("move lift w/ joystick", new moving_lift_w_joysticks());
        
        SmartDashboard.putData("one tote auto", new OneToteAuto());
        
        SmartDashboard.putData("three tote auto", new ThreeToteAuto());
        
        SmartDashboard.putData("two tote auto", new TwoToteAuto());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

