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
import frc.robot.commands.DriveNormal;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.    
  WPI_TalonSRX _leftTal = new WPI_TalonSRX(RobotMap.CAN_ID_LEFT_DRIVE);
  WPI_VictorSPX _rightVic = new WPI_VictorSPX(RobotMap.CAN_ID_RIGHT_DRIVE);
  DifferentialDrive robotDrive = new DifferentialDrive(_leftTal,_rightVic);
  
  public  void DriveInit(){
    _leftTal.configOpenloopRamp(0.5);
    _rightVic.configOpenloopRamp(0.5);
  }
  

  public void CheeseForSpeed(double speed, double turn) {
    double forwardSpeed;
    double turnSpeed;
    boolean turboMode = Robot.m_oi.stick.getRawButton(RobotMap.TURBO_BUTTON);
    if (turboMode) {
      forwardSpeed = RobotMap.TURBO_DRIVE_SPEED;
      turnSpeed = RobotMap.TURBO_DRIVE_TURN;
    }
    else{
      forwardSpeed = RobotMap.TOP_DRIVE_SPEED;
      turnSpeed = RobotMap.TOP_DRIVE_TURN;
    }

    robotDrive.arcadeDrive(forwardSpeed*speed, turnSpeed*turn);
  }

  @Override
  public  void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveNormal());
  }
}
