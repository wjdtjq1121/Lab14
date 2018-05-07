package edu.handong.csee.java.exceptionhandle.example.prob5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the string or null to test exception handling: ");
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			Prob5.myTest(str);
		} catch(MyException mae) {
			System.out.println("Inside catch block: " + mae);
		}
	}
	static void myTest(String str) throws MyException{
		if(str.equals("null")) {
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is:" + str );
	}
}