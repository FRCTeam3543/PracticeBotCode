package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

public class ShuffleCode extends Subsystem{



    public void shufflemyboard(){
        Shuffleboard.getTab("Dashboard")
        .addPersistent("Top Motor Speed", 0);
    }

    @Override
    protected void initDefaultCommand() {}


}