package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Config;


public class OI {
    //Well this part of the code is where we initiate the xbox controller to receive information from other files
    //public static XboxController xbox = new XboxController(Config.XBOX_PORT);
    public final Joystick j1 = new Joystick(Config.JOYSTICK1_PORT);
    public final Joystick j2 = new Joystick(Config.JOYSTICK2_PORT);
    
    public Joystick Drive(){
        return j1;
    }
    public Joystick Operator(){
        return j2;
    }
    //public XboxController getJoystick(){
    //    return xbox;
    //}
}