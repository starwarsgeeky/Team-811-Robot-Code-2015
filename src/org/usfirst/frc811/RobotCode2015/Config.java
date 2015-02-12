package org.usfirst.frc811.RobotCode2015;

public interface Config {

	//Joysticks
    int JOY_PORT_1 = 1;
    int JOY_PORT_2 = 2;
    
    //Compressor Ports
    	//int COMPRESSOR_RELAY = 1;  ???
    	//int COMPRESSOR_PRESSURE_INPUT = 4; ???
    int COMPRESSOR_PORT = 0;
    
    //Claw Ports
    int CLAW_CLOSE_CHANNEL = 0;
    int CLAW_OPEN_CHANNEL = 1;
    
    //Lift Ports
    int LIFT_LEFT_TALON_PORT = 6;
    int LIFT_RIGHT_TALON_PORT = 7;
    
    
    //Drive Ports
    int FRONT_LEFT_PORT = 1;
    int REAR_LEFT_PORT = 2;
    int FRONT_RIGHT_PORT = 4;
    int REAR_RIGHT_PORT = 3;
    int GYRO_CHANNEL = 1;
    int DRIVE_ENCODER_PORT_1 = 1;
    int DRIVE_ENCODER_PORT_2 = 2;
    
    
    //Arm Ports
    int ARM_TALON_PORT = 8;
    
    
    //Limit Switch Ports
    int TOTE_TRIGGER_LIMITSWITCH_CHANNEL = 2;
    
    
    //Drive Vars
    double JOYSTICK_DRIVE_TOLERANCE = .3;
    double DEFAULT_SPEED_SCALE = 1;
    double SLOW_SPEED_SCALE = .75;
    double ROBOT_DRIVE_EXPIRATION = 0.1;
    double ROBOT_DRIVE_SENSITIVITY = 0.5;
    double ROBOT_DRIVE_MAX_OUTPUT = 1.0;
    double GYRO_SENSITIVITY = 0.007;
    double DRIVE_ROTATION_COUNT = 1; //TODO:
    double DRIVE_ENCODER_DISTANCE_PER_PULSE = 1; //TODO:
    double DRIVE_PID_SETPOINT = 5; //TODO:
    int DRIVE_END_COMMAND_DIFFERENCE_VALUE = 10; //TODO:
    
    
    //Lift Vars
    double LIFT_LEFT_ENCODER_DISTANCE_PER_PULSE = 1.0;
    double LIFT_RIGHT_ENCODER_DISTANCE_PER_PULSE = 1.0;
    int LIFT_MAX_DISTANCE = 50; //TODO:
    int LIFT_MIN_DISTANCE = 0; //TODO:
    int LIFT_END_COMMAND_DIFFERENCE_VALUE = 10; //TODO:
    
    
    //Arm Vars
    double ARM_TO_NOODLE_SETPOINT = 3;
    double ARM_TO_DOWN_SETPOINT = 1;
    double ARM_TO_UP_SETPOINT = 5;
    double ARM_MAX_DISTANCE = 5;
    double ARM_MIN_DISTANCE = 0;
    int ARM_TALON_FORWARD_SOFT_LIMIT = 90;
    int ARM_TALON_REVERSE_SOFT_LIMIT = 10;
    int ARM_END_COMMAND_DIFFERENCE_VALUE = 10; //TODO:
    
    
    //Drive Controls
    int DRIVE_X_JOYSTICK_AXIS = 1;
    int DRIVE_Y_JOYSTICK_AXIS = 5;
    int DRIVE_STRAFING_JOYSTICK_AXIS = 3;
    int FIELD_CENTRIC_BUTTON = 8;
    int ROBOT_CENTRIC_BUTTON = 7;
    int SLOW_BUTTON = 6;
    int ENCODER_RESET_BUTTON = 3;
    int GYRO_RESET_BUTTON = 4;
    
    //CLaw Controls
    int CLAW_CLOSE_BUTTON = 2;
    int CLAW_OPEN_BUTTON = 1;
    
    //Arm Controls
    int ARMS_MOVEMENT_JOYSTICK_AXIS = 1;
    int ARM_DOWN_BUTTON = 3;
    int ARM_UP_BUTTON = 4;
    int ARM_NOODLE_BUTTON = 8;
    
    //Lift Controls
    int LIFT_JOYSTICK_AXIS = 3;
    int LIFT_DOWN_BUTTON = 5;
    int LIFT_UP_BUTTON = 6;
    
    //Smartdashboard variables
    String strRobotOrientation = "Robot Orientation";
    String dblRobotSpeedScale = "Robot Speed Scale";
    String dblRobotAutoDriveTime = "Auto Drive Time";
    String dblRobotAutoMode = "autonomous";
    String blnHotZone = "hotZone";
    String dblGyro = "gyro";
	
    
}