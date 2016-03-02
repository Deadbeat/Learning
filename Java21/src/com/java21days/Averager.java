package com.java21days;

public class Averager {

	/**
	 * This class is included because it uses command line args
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		
		if(args.length > 0) {
			for(int i = 0 ; i < args.length ; i++) {
				sum += Integer.parseInt(args[i]);
			}
			
			System.out.println("Sum is: " + sum);
			System.out.println("Avg is: " + (float)sum / args.length);
		} else {
			System.out.println("No Args");
		}

	}

}
