package org.usfirst.frc.team1334.robot.Subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Created by FRC1334 on 6/2/2016.
 */
public class DriveSubsystem extends Subsystem {
    static Talon left1 = new Talon (0);
    static Talon left2 = new Talon (1);
    static Talon right1 = new Talon (2);
    static Talon right2 = new Talon (3);

    @Override
    protected void initDefaultCommand() {

    }
    public static void tankDrive (double left, double right){

        left1.set(left);
        left2.set(left);
        right1.set(-right);
        right2.set(-right);
    }

        public static void arcadeDrive (double speed, double turn){
        tankDrive (speed+turn, speed-turn);
    }
}
