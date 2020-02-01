<<<<<<< HEAD
package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

public class vision extends Subsystem{
public void vision_start(){
//initializing.
        final NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        final NetworkTableEntry tx = table.getEntry("tx");
        final NetworkTableEntry ty = table.getEntry("ty");
        final NetworkTableEntry ta = table.getEntry("ta");

        // read values periodically
        final double x = tx.getDouble(0.0);
        final double y = ty.getDouble(0.0);
        final double area = ta.getDouble(0.0);

//post to smart dashboard periodically
    Shuffleboard.selectTab("Dashboard");
    Shuffleboard.getTab("Dashboard").add("LimelightX", x).withWidget(BuiltInWidgets.k3AxisAccelerometer);
    Shuffleboard.getTab("Dashboard").add("LimelightY", y);
    Shuffleboard.getTab("Dashboard").add("LimelightArea", area);
}

    @Override
    protected void initDefaultCommand() {
    }
}
=======
//currently in development.
>>>>>>> master
