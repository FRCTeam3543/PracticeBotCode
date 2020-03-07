package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DrivingTank extends Subsystem {

/// Victor's ///
/// Left Victors ///
WPI_VictorSPX LeftFront = new WPI_VictorSPX(Config.LEFT_FRONT_VICTOR);
WPI_VictorSPX LeftBack = new WPI_VictorSPX(Config.LEFT_BACK_VICTOR);
/// Right Victors ///
WPI_VictorSPX RightFront = new WPI_VictorSPX(Config.RIGHT_FRONT_VICTOR);
WPI_VictorSPX RightBack = new WPI_VictorSPX(Config.RIGHT_BACK_VICTOR);

private DifferentialDrive drive;

private SpeedControllerGroup Left = new SpeedControllerGroup(LeftFront, LeftBack);
private SpeedControllerGroup Right = new SpeedControllerGroup(RightFront, RightBack);


  public DrivingTank() {
    super();

    drive = new DifferentialDrive(Left, Right);
    
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

    public void stop() {
    drive.stopMotor();
    }

  @Override
  protected void initDefaultCommand() {

  }


}