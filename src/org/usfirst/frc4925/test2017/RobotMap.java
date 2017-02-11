// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4925.test2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainCANTalon1;
    public static CANTalon driveTrainCANTalon2;
    public static RobotDrive driveTrainDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainCANTalon1 = new CANTalon(8);
        LiveWindow.addActuator("Drive Train", "CAN Talon 1", driveTrainCANTalon1);
        
        driveTrainCANTalon2 = new CANTalon(7);
        LiveWindow.addActuator("Drive Train", "CAN Talon 2", driveTrainCANTalon2);
        
        driveTrainDrive = new RobotDrive(driveTrainCANTalon1, driveTrainCANTalon2);
        
        driveTrainDrive.setSafetyEnabled(true);
        driveTrainDrive.setExpiration(0.1);
        driveTrainDrive.setSensitivity(0.5);
        driveTrainDrive.setMaxOutput(1.0);
        driveTrainDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
