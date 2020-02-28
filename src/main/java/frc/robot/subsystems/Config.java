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

/// Talon's ///
/// Left Talons ///
public static final int LEFT_FRONT_TALON = 4;
public static final int LEFT_BACK_TALON = 2;
/// Right Talons ///
public static final int RIGHT_FRONT_TALON = 3;
public static final int RIGHT_BACK_TALON = 1;

/// Shooter Talons ///
public static final int SHOOT_1 = 0;
public static final int SHOOT_2 = 1;

/// Shooter Speed ///
/**
 * s1 is bottom of shooter = 0
**/
//public static final int S1_SPEED = 10;
/**
 * s2 is top of shooter = 1
**/
//public static final int S2_SPEED = 5;

/// CustomVision Variables ///
/// Vision Drive ///
public final boolean DRIVE_VISION_ENABLED = false;
public static final double PRECISION_DRIVE_LIMIT = 0.25;
public static final double VISION_ERROR = 1;
public static double X_VISION;
public static double Y_VISION;

}
