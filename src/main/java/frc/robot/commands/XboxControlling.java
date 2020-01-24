package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class XboxControlling extends Command {
    boolean usingArcade = false;

    public void driveswitch() {
        if (OI.xbox.getBButtonPressed()) {
            usingArcade = !usingArcade;
        }

        if (usingArcade) {
            Robot.tanky.arcadeDrive(OI.xbox.getY(Hand.kLeft), OI.xbox.getX(Hand.kLeft));
            }
        else{
            Robot.tanky.tankDrive(OI.xbox.getY(Hand.kLeft), OI.xbox.getY(Hand.kRight));
        }

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

}