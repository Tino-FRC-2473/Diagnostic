package org.usfirst.frc.team2473.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick stick;
	
	private static OI theInstance;
	
	static {
		theInstance = new OI();
	}
	
	private OI() {
		stick = new Joystick(0);
	}
	
	public static OI getInstance() {
		return theInstance;
	}
	
	public Joystick getJoy() {
		return stick;
	}
}