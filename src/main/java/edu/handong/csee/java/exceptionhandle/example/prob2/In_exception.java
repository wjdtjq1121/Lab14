package edu.handong.csee.java.exceptionhandle.example.prob2; // set the package where this belongs to

import java.util.*; // bring all the classes from java library

public class In_exception { // a class which can access from other package

	private int x = 0; // declare x member
	private int y = 0; // declare y member

	public In_exception() { // constructor, executed when instance is created
	}

	public void errorDetect() // void method no input, return value
	{
		try { // test if exception occurs
			Scanner keyboard = new Scanner(System.in); // creating things so the program can accept input value
			System.out.print("x: "); // print the specific statement, showing x
			x = keyboard.nextInt(); // getting x value from the user
			System.out.print("y: "); // print the specific statement, showing y
			y = keyboard.nextInt(); // getting y value from the user
			System.out.println(this.x/this.y); // print the value x/y
		}
		catch(ArithmeticException e) { // exception thrown, it happens arithmetic
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // print the specific message and call getmessage
		}
		catch(InputMismatchException e) { // exception thrown, it happens inputmismatch
			System.out.println("java.util.InputMismatchException"); // print the specific statement 
		}
		catch(Exception e) { // exception thrown, it happens exception
			System.out.println("Some other exception has occurred: " + e.getMessage()); // print the specific statement other thing
		}

	}

}
