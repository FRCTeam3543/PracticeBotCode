package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class XboxControlling extends Command {
    boolean usingArcade = false;

    public void driveswitch() {
        if (Robot.oi.Drive().getTriggerPressed()) {
            usingArcade = !usingArcade;
        }
        if (usingArcade) {
            Robot.tanky.arcadeDrive(Robot.oi.Drive().getY(), Robot.oi.Drive().getX());
            }
        else{
            Robot.tanky.tankDrive(Robot.oi.Operator().getX(), Robot.oi.Drive().getY());
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}