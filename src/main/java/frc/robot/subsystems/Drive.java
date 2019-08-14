/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Move;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.    
  private final WPI_TalonSRX _leftTalon = new WPI_TalonSRX(RobotMap.leftMotor);
  private final WPI_VictorSPX _rightVictor = new WPI_VictorSPX(RobotMap.rightMotor);
  public final DifferentialDrive robotDrive = new DifferentialDrive(_leftTalon,_rightVictor);  
  
/**
 * Simple arcade robot drive
 * @param speed
 * @param turn
 */
  public void arcadeDrive(double speed, double turn) {
    robotDrive.arcadeDrive(RobotMap.DRIVE_TOP_SPEED_FORWARD*speed, RobotMap.DRIVE_TOP_SPEED_TURNING*turn);
  }

  @Override
  public  void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Move());
  }
}
