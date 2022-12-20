// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class Shooter extends CommandBase {
  /** Creates a new shooter. */
  public Shooter() {
    // checking for reqs
    addRequirements(RobotContainer.shooter);
  }
  // getting a boolean to check for input


  // Called when the command is initially scheduled.
  /* (non-Javadoc)
   * @see edu.wpi.first.wpilibj2.command.Command#initialize()
   */

  // init the boolean values
  static boolean isInput, isEnd; 

  @Override
  public void initialize() {
        // getting the values of the key inputs
        isInput = RobotContainer.joystick.getRawButtonPressed(Constants.k_buttonInfo); 
        isEnd = RobotContainer.joystick.getRawButtonPressed(Constants.k_buttonInfo); 
  }
  

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      // if the boolean is true run 
      if (Shooter.isInput && !Shooter.isEnd)
        RobotContainer.shooter.m_back.set(Constants.k_speed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
