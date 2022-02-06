// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Joystick;
package frcteam3255.robotbase.Joystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.SN_Extreme3DStick;
import edu.wpi.first.wpilibj2.command.button.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.Autonomous.Autonomous;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.LFdrive;
import frc.robot.subsystems.LFdrivePID;
import frc.robot.subsystems.LFsteer;
import frc.robot.subsystems.LFsteerPID;
import frc.robot.subsystems.LRdrive;
import frc.robot.subsystems.LRdrivePID;
import frc.robot.subsystems.LRsteer;
import frc.robot.subsystems.LRsteerPID;
import frc.robot.subsystems.RFdrive;
import frc.robot.subsystems.RFdrivePID;
import frc.robot.subsystems.RFsteer;
import frc.robot.subsystems.RFsteerPID;
import frc.robot.subsystems.RRdrive;
import frc.robot.subsystems.RRdrivePID;
import frc.robot.subsystems.RRsteer;
import frc.robot.subsystems.RRsteerPID;
import frc.robot.commands.;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public static final LFdrive lfdrive = new LFdrive();
  public static final LFsteer lfsteer = new LFsteer();
  public static SN_Extreme3DStick manipulator = new SN_Extreme3DStick(1);
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    
	move = new Move();
	
	
	configureButtonBindings();

    SmartDashboard.putData(key, data);
    SmartDashboard.putData(key, data);
    SmartDashboard.putData(key, data);
    SmartDashboard.putData(key, data);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
	manipulator.btn_1.whileHeld();
	manipulator.btn_2.whileHeld();
	manipulator.btn_3.whenPressed();
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
  
  
}
