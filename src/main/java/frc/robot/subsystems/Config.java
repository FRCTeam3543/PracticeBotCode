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
public static final int LEFT_BACK_TALON = 3;
/// Right Talons ///
public static final int RIGHT_FRONT_TALON = 2;
public static final int RIGHT_BACK_TALON = 1;

/// Shooter Talons ///
public static final int SHOOT_1 = 0;
public static final int SHOOT_2 = 1;

/// Shooter Speed ///
//s1 is bottom of shooter
public static final int S1_SPEED = 10;
//s2 is top of shooter
public static final int S2_SPEED = 5;
}
