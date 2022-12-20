// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shoot extends SubsystemBase {
  /** Creates a new Shoot. */
  public WPI_TalonFX m_back = new WPI_TalonFX(Constants.k_motorPort);
  public Joystick joystick = new Joystick(Constants.k_joystickPort);
  // getting movement to the speed controller
  public void Move(){
  m_back.set(Constants.k_speed);
  }
  public Shoot() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
