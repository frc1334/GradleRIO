package org.usfirst.frc.team1334.robot.Util;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1334.robot.Subsystems.DriveSubsystem;

/**
 * Created by gabri on 2016-05-09.
 */
public class Subsystems {

    /**
     * Usage:
     *
     * public static ExampleSubsystem EXAMPLE_SUBSYSTEM;
     */
    public static DriveSubsystem DRIVE_SUBSYSTEM;

    public Subsystems()
    {
        /**
         * Usage:
         *
         * EXAMPLE_SUBSYSTEM = new ExampleSubsystem();
         */
     DRIVE_SUBSYSTEM = new DriveSubsystem ();

    }


    public static void print(Object o)
    {
        System.out.println(o);
    }
}
