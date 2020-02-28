package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Config;

public class XboxControlling extends Command {
    boolean usingArcade = false;


    public void driveswitch() {
        if (OI.xbox.getBButtonPressed()) {
            usingArcade = !usingArcade;
        }

        if (usingArcade) {
            Robot.tanky.arcadeDrive(OI.xbox.getY(Hand.kLeft), -OI.xbox.getX(Hand.kLeft));
            SmartDashboard.getBoolean("UsingArcade", usingArcade);
            }
        else{
            Robot.tanky.visionDrive(Config.PRECISION_DRIVE_LIMIT);
            SmartDashboard.putString("DriveSystem", "Vision");
        }

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    

}