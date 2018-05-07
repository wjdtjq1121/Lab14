package edu.handong.csee.java.exceptionhandle.example.prob1; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library
import java.util.Random; // bring the random class from java library

public class Prob1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int limit = 0;
		int speed = 0;

		System.out.print("Set the speed limit, officer: ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);

		SpeedLimiter lim = new SpeedLimiter(limit, speed);

		lim.warnSpeedLim();

		keyboard.close();

	}
}
