/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public final static int CAN_ID_LEFT_DRIVE = 22;
  public final static int CAN_ID_RIGHT_DRIVE = 20;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //Joystick port and axis assignments
  public final static int JOY_PORT_DRIVER = 0;
  public final static int JOY_PORT_OPERATOR = 1;
  public final static int JOY_AXIS_SPEED = 1;
  public final static int JOY_AXIS_TURN = 4;

  //Joystick button assignments
  public static int TURBO_BUTTON = 1;

  //Drivetrain Characteristics
  public final static double TURBO_DRIVE_SPEED = 0.85;
  public final static double TURBO_DRIVE_TURN = 0.85;
  public final static double TOP_DRIVE_SPEED = 0.65;
  public final static double TOP_DRIVE_TURN = 0.65;
}
