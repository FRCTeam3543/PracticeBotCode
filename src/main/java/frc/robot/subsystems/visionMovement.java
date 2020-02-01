package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class visionMovement extends Subsystem{

    private final Gyro gyro = new ADXRS450_Gyro();
    
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

}