package edu.handong.csee.java.exceptionhandle.example.prob1; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library
import java.util.Random; // bring the random class from java library

public class Prob1 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system

		Scanner keyboard = new Scanner(System.in); // creating things so program can accept inputs
		Random rand = new Random(); // creating things, bring random class so we can use it in prob1 class
		int limit = 0; // declare limit member
		int speed = 0; // declare speed member

		System.out.print("Set the speed limit, officer: "); // print the statement to ask user to put limit value
		limit = keyboard.nextInt(); // get limit value from user
		speed = rand.nextInt(101); // get speed value from user

		SpeedLimiter lim = new SpeedLimiter(limit, speed); // creating thing so we can use speedlimiter class, has two input values

		lim.warnSpeedLim(); // call warnspeedlim method to execute

		keyboard.close(); // its closed because we dont need keyboard input anymore
	}
}
