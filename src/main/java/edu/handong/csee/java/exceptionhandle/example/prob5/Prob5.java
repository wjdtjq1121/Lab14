package edu.handong.csee.java.exceptionhandle.example.prob5; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library

public class Prob5 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system

		try { // test if exception occurs
			System.out.println("Enter the string or null to test exception handling: "); // ask user to put string value
			Scanner keyboard = new Scanner(System.in); // creating a thing so the program can accept value
			String str = keyboard.nextLine(); // user puts str value
			Prob5.myTest(str); // calling mytest method with putting str value
		} catch(MyException mae) { // exception thrown, myexception occurs
			System.out.println("Inside catch block: " + mae); // print the specific message
		}
	}
	static void myTest(String str) throws MyException{ // mytest method, has string str input value, throws exception
		if(str.equals("null")) { // condition is string is null
			throw new MyException("String val is null"); // throws exception, exception occurs statement
		}
		else // otherwise
			System.out.println("String val is:" + str ); // print the str value
	}
}