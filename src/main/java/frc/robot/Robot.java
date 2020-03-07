package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.commands.XboxControlling;
import frc.robot.subsystems.Config;
import frc.robot.subsystems.DrivingTank;

public class Robot extends TimedRobot {
  /// Initiating Systems ///
  public static XboxControlling smash = new XboxControlling();
  public static OI oi = new OI();
  public static Config config = new Config();
  public static DrivingTank tanky = new DrivingTank();

  // public static VisionCustom see = new VisionCustom();
  // public static ExampleSubsystem m_subsystem = new ExampleSubsystem();

  @Override
  public void robotPeriodic() {
  }
  @Override
  public void robotInit() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    smash.driveswitch();
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {

  }

}
