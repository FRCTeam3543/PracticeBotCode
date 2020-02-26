package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

public class VisionCustom extends Subsystem{

public void visionInit(){
//initializing.
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");
    NetworkTableEntry ty = table.getEntry("ty");
    NetworkTableEntry ta = table.getEntry("ta");

    // read values
    Config.X_VISION = tx.getDouble(0.0);
    Config.Y_VISION = ty.getDouble(0.0);
    final double area = ta.getDouble(0.0);

    /*/post to smart dashboard
    Shuffleboard.selectTab("Vision");
    Shuffleboard.getTab("Vison").add("LimeX", Config.Y_VISION);
    Shuffleboard.getTab("Vison").add("LimeY", Config.X_VISION);
    Shuffleboard.getTab("Vison").add("LimeArea", area);

    *///smart dashboard motor values shown
}

public void visionUpdate(){
    Shuffleboard.update();

}

    @Override
    protected void initDefaultCommand() {
    }
}
//currently in development.
