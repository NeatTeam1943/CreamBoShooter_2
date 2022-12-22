// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class Shooter extends CommandBase {
  /** Creates a new shooter. */
  public Shooter() {
    // checking for reqs
    addRequirements(RobotContainer.S_shoot);
  }
  // getting a boolean to check for input


  // Called when the command is initially scheduled.
  /* (non-Javadoc)
   * @see edu.wpi.first.wpilibj2.command.Command#initialize()
   */

  // init the boolean values
  private boolean endInput;
  @Override
  public void initialize() {
    this.endInput = false;
  }
  

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      // if the boolean is true run 
    if (!RobotContainer.joystick.getAButtonPressed() && !this.endInput)
      RobotContainer.S_shoot.Move();
    else
      this.endInput = true; 

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
