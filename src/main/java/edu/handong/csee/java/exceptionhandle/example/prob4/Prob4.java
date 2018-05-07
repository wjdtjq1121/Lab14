package edu.handong.csee.java.exceptionhandle.example.prob4; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library

public class Prob4 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system
		Scanner keyboard = new Scanner(System.in); // creating a thing so the program can accept input value
		int num=0; // declare num value 0
		Boundary arr = new Boundary(); // creating a thing so we can use boundary class
		boolean repeat = true; // declare boolean member repeat
		while(repeat) // condition if repeat is true
		{
			try // test if exception occurs
			{
				System.out.print("Enter an integer: "); // ask user to put integer value
				num = keyboard.nextInt(); // stores int value in num member
				arr.receive(num);  // calling receive method with putting num value
			}
			catch(ArrayIndexOutOfBoundsException e) // exception thrown, arrayindexout happens
			{
				System.out.println("Invalid array index access!"); // print the specific statement, invalid array
				repeat = false; // stores false value in repeat member
			}
		}
	}

}
