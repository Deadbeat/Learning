package com.java21days;

public class MarsApplication {
	public static void main(String[] arg) {
		
		MarsRobot spirit = new MarsRobot();
		
		spirit.status = "exploring";
		spirit.speed = 2;
		spirit.temperature = -60;
		spirit.showAttributes();

		System.out.println("Increasing speed to 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		
		System.out.println("Changing temp to -90");
		spirit.temperature = -90;
		spirit.showAttributes();
		
		System.out.println("Checking Temp");
		spirit.checkTemperature();
		spirit.showAttributes();
	
	}
}
