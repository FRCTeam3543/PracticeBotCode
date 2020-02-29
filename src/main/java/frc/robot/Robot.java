/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.logging.Logger;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static final Logger LOG = Logger.getLogger("Robot");

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */

  /// Initiating Systems //
  public static Shoot shorty = new Shoot();
  public static OI oi = new OI();
  public static Config config = new Config();
  public static DrivingTank tanky = new DrivingTank();
  public static ShuffleCode shuffly = new ShuffleCode();

  BallCamera ballCamera;
  TargetCamera targetCamera = new TargetCamera();

  // protected PixyCamera pixy;

  // public static VisionCustom see = new VisionCustom();
  // public static ExampleSubsystem m_subsystem = new ExampleSubsystem();

  @Override
  public void robotPeriodic() {
  }
  @Override
  public void robotInit() {
    // pixy = new PixyCamera();
    ballCamera = new BallCamera();
  }

  @Override
  public void autonomousInit() {
    tanky.resetGyro();
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    tanky.resetGyro();
  }

  @Override
  public void teleopPeriodic() {
    tanky.arcadeDrive(OI.xbox.getY(Hand.kLeft), -OI.xbox.getX(Hand.kLeft));

    double straight = OI.xbox.getY(Hand.kRight);
    if (Math.abs(straight) > 0.05) {
      tanky.driveStraight(straight);
    }

    shorty.shooty();
    shorty.shufflemyboard();

    // publish the ball shooter stats
    SmartDashboard.putBoolean("Ball detected", ballCamera.checkForBall());

    // get the target distance
    targetCamera.getTargetDistance();

    // see.visionInit();
    // see.visionUpdate();
  }

  @Override
  public void testInit() {
    tanky.resetGyro();
  }

  @Override
  public void testPeriodic() {

  }

}
