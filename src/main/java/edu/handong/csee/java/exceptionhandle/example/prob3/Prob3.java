package edu.handong.csee.java.exceptionhandle.example.prob3; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library

public class Prob3 { // a class which can access from other package

	public static final Powercalc myCalculator = new Powercalc(); // creating thing so we can use powercalc class, type is static final
	public static final Scanner in = new Scanner(System.in); // creating thing so the program can accept input value, type is static final

	public static void main(String[] args) { // a void method, invoked by the system
		System.out.println("Enter two inegers to execute pow method: "); // print the statement to ask user to put values
		while(in.hasNextInt()) { // condition if the program have integer value
			int n = in.nextInt(); // getting n value from the user
			int p = in.nextInt(); // getting p value from the user
			try { // test if exception occurs
				System.out.println(myCalculator.power(n, p)); // print the statement calling power method
				System.out.println("Enter two inegers to execute pow method: "); // print the message to ask the user to put value
			} catch(Exception e) { // exception thrown, it happens exception
				System.out.println(e); // print the message, it receives e
			}
		}
	}
}

