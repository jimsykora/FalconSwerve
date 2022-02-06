// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;
import frc.robot.RobotPreferences;

/** Add your docs here. */
public class LFdrive extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private CANSparkMax lfdrive;
  private CANEncoder lfdriveEnocder;
  private CANPIDController lfdPIDController;
  private double speed;

  public LFdrive() {
    lfdFalcon = new CANSparkMax(RobotMap.LF_DRIVE);
    lfdrivePIDController = new LFDrive.getPIDController();
    lfdFalcon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    
    configureLFdrive();
  }
    
  public void configureLFdrive() {

    lfdPIDController.setP(RobotPreferences.lfdP.getValue());
    lfdPIDController.setI(RobotPreferences.lfdI.getValue());
    lfdPIDController.setD(RobotPreferences.lfdD.getValue());
    lfdPIDController.setFF(RobotPreferences.lfdFF.getValue());
    lfdPIDController.setOutputRange(-1.0, 1.0);
  }

  public void setLFdriveSetpoint(double setpoint) {
    speed = setpoint;

  }

  public void setLFdriveSpeed() {
    configureLFdrive();
    if (speed < 3000) {
      setLFdriveSpeed(RobotPreferences.lfdLowSpeedCoefficient.getValue()
          * (speed / RobotPreferences.lfdMaxRPM.getValue()));
    } else {
      lfdPIDController.setReference(speed, ControlType.kVelocity);
    }

    public void setLFdriveSpeed(double speed) {
      lfdMaster.set(speed);
    }
  
  
    public boolean isLFdriveSpedUp() {
      // return (Math.abs(getShooterSpeed() - goalVelocity) <
      // RobotPreferences.shooterTolerance.getValue());
      return (Math.abs(getLFdriveSpeed()) > speed);
      // return getShooterSpeed() > goalVelocity;
    }
  
    public double getLFdriveError(double goalRPM) {
      return Math.abs(getLFdriveSpeed() - goalRPM);
    }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
