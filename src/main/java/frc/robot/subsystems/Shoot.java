package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

public class Shoot extends Subsystem {

    Spark ShootM1 = new Spark(Config.SHOOT_1);
    Spark ShootM2 = new Spark(Config.SHOOT_2);
    
    private boolean isShootReady() {
        return true;
    }

    public void shooty(){
        if(isShootReady()){
            ShootM1.set(Robot.oi.xbox.getTriggerAxis(Hand.kRight));
            ShootM2.set(Robot.oi.xbox.getTriggerAxis(Hand.kRight));
            //ShootM1.set(Config.S1_SPEED);
            //ShootM2.set(Config.S2_SPEED);
        }
        else{
            ShootM1.stopMotor();
            ShootM2.stopMotor();
        }
    }



    @Override
    protected void initDefaultCommand() {}

}