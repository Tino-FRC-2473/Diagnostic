package org.usfirst.frc.team2473.robot.diagnostics;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) {
		try {
			new SocketPingThread().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}