package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DrivingTank extends Subsystem {
//////
// TalonSRX
//////
/// Left Talons ///
WPI_VictorSPX LeftFrontT = new WPI_VictorSPX(Config.LEFT_FRONT_TALON);
WPI_VictorSPX LeftBackT = new WPI_VictorSPX(Config.LEFT_BACK_TALON);
/// Right Talons ///
WPI_VictorSPX RightFrontT = new WPI_VictorSPX(Config.RIGHT_FRONT_TALON);
WPI_VictorSPX RightBackT = new WPI_VictorSPX(Config.RIGHT_BACK_TALON);

//////
// TalonSRX group
//////
private final SpeedControllerGroup Left = new SpeedControllerGroup(LeftFrontT, LeftBackT);
private final SpeedControllerGroup Right = new SpeedControllerGroup(RightFrontT, RightBackT);

private final DifferentialDrive drive = new DifferentialDrive(Left, Right);

  public DrivingTank() {
    super();

    Right.setInverted(true);
    Left.setInverted(true);
    drive.setDeadband(0.4);
    drive.setSafetyEnabled(false);

  }

  /**
   * Tank drive using individual joystick axes.
   *
   * @param leftAxis  Left sides value
   * @param rightAxis Right sides value
   */
  public void tankDrive(double leftAxis, double rightAxis) {
    drive.tankDrive(leftAxis, rightAxis);
  }

  /**
   * Get the value from the left stick
   * 
   * @param xSpeed  Left side values
   * @param zRotate
   */
  public void arcadeDrive(double xSpeed, double zRotate) {
    drive.arcadeDrive(xSpeed, zRotate, true);
  }

  public void visionDrive(double adjustmentSpeed){
    double x = Config.X_VISION;

    if(x >= Config.VISION_ERROR){
      drive.arcadeDrive(adjustmentSpeed, x);
    }
    SmartDashboard.putNumber("TurnAngle", x);
  }

  public void stop() {
  drive.stopMotor();
    }

  @Override
  protected void initDefaultCommand() {

  }


}