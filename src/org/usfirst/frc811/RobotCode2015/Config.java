package org.usfirst.frc811.RobotCode2015;

interface Config {

	//Joysticks
    int JOY_PORT_1 = 1;
    int JOY_PORT_2 = 2;
    
    //Compressor Ports
    int COMPRESSOR_RELAY = 1;
    int COMPRESSOR_PRESSURE_INPUT = 4;
    
    //Claw Ports
    int CLAW_CLOSE_CHANNEL = 3;
    int CLAW_OPEN_CHANNEL = 4;
    int CLAW_ACTUATOR_PORT = 5;
    
    //Lift Ports
    int LIFT_LEFT_TALON_PORT = 1;
    int LIFT_RIGHT_TALON_PORT = 2;
    
    //Drive Ports
    int FRONT_LEFT_PORT = 3;
    int REAR_LEFT_PORT = 4;
    int FRONT_RIGHT_PORT = 2;
    int REAR_RIGHT_PORT = 1;
    int GYRO_CHANNEL = 1;
    int DRIVE_ENCODER_PORT_1 = 9;
    int DRIVE_ENCODER_PORT_2 = 10;
    
    
    //Limit Switch Ports
    int LIFT_LEFT_TOP_LIMITSWITCH_CHANNEL = 1;
    int LIFT_LEFT_BOTTOM_LIMITSWITCH_CHANNEL = 3;
    int LIFT_RIGHT_TOP_LIMITSWITCH_CHANNEL = 4;
    int LIFT_RIGHT_BOTTOM_LIMITSWITCH_CHANNEL = 5;
    int TOTE_TRIGGER_LIMITSWITCH_CHANNEL = 2;
    
    
    //Drive Vars
    double JOYSTICK_DRIVE_TOLERANCE = .3;
    double DEFAULT_SPEED_SCALE = 1;
    double SLOW_SPEED_SCALE = .75;
    double Kp = 0.03;
    
    
    //Drive Controls
    int DRIVE_X_JOYSTICK_AXIS = 3;
    int DRIVE_Y_JOYSTICK_AXIS = 2;
    int DRIVE_TURNING_JOYSTICK_AXIS = 4;
    int FIELD_CENTRIC_BUTTON = 1;
    int ROBOT_CENTIC_BUTTON = 2;
    int SLOW_BUTTON = 6;
    int ENCODER_RESET_BUTTON = 9;
    int GYRO_RESET_BUTTON = 10;
    
    //CLaw Controls
    int CLAW_CLOSE_BUTTON = 1;
    int CLAW_OPEN_BUTTON = 2;
    
    //Arm Controls
    int ARMS_MOVEMENT_JOYSTICK_AXIS = 2;
    
    //Lift Controls
    int LIFT_JOYSTICK_AXIS = 1;
    int LIFT_DROPOFF_BUTTON = 3;
    
    //Smartdashboard variables
    String strRobotOrientation = "Robot Orientation";
    String dblRobotSpeedScale = "Robot Speed Scale";
    String dblRobotAutoDriveTime = "Auto Drive Time";
    String dblRobotAutoMode = "autonomous";
    String blnHotZone = "hotZone";
    String dblGyro = "gyro";
	
}
