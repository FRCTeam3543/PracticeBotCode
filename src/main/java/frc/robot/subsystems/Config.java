package frc.robot.subsystems;
/*
------------------
When naming something it has to be ALL CAPS so that the file can locate
and we can read it better.
------------------
*/
public class Config{
/// Operating Interface (OI) ///
public static final int XBOX_PORT = 0;

/// Victor's ///
/// Left Victors ///
public static final int LEFT_FRONT_VICTOR = 2;
public static final int LEFT_BACK_VICTOR = 0;
/// Right Victors ///
public static final int RIGHT_FRONT_VICTOR = 1;
public static final int RIGHT_BACK_VICTOR = 3;

public static final int GYRO_PORT = 1;
public static final double GYRO_GAIN = 1 / 20;

public static final int JOYSTICK1_PORT = 0;
public static final int JOYSTICK2_PORT = 1;
}
