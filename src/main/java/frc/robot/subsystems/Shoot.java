package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shoot extends Subsystem {

    public Spark ShootM1 = new Spark(Config.SHOOT_1);
    public Spark ShootM2 = new Spark(Config.SHOOT_2);

    //private boolean isShootReady() {
    //    return true;
    //}
    public void shufflemyboard() {
        SmartDashboard.putNumber("Top Motor", ShootM2.get());
        SmartDashboard.putNumber("Bottom Motor", ShootM1.get());
    }

    public void shooty(){
        ShootM1.set(SmartDashboard.getNumber("Bottom Motor", ShootM1.get()));
        ShootM2.set(SmartDashboard.getNumber("Top Motor", ShootM2.get()));
        //ShootM1.set(Config.S1_SPEED);
        //ShootM2.set(Config.S2_SPEED);
        /*if(isShootReady()){
            //ShootM1.set();
            //ShootM2.set(Robot.oi.xbox.getTriggerAxis(Hand.kRight));
            
        }
        else{
            ShootM1.stopMotor();
            ShootM2.stopMotor();
        }
        */
    }



    @Override
    protected void initDefaultCommand() {}

}