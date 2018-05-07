package edu.handong.csee.java.exceptionhandle.example.prob6; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library

public class Prob6 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system
		String name; // declare name member
		String race; // declare race member
		int age = 0; // declare age member 0
		Scanner keyboard = new Scanner(System.in); // creating a thing so the program can accept input value
		CustomID obj = new CustomID(); // creating a thing so we can use customid class
		boolean repeat = true; // declare repeat member as true

		while(repeat) // condition if repeat is true
		{
			try { // test if exception occurs
				if(obj.getState() == 0) { // condition if getstate method value is zero
					System.out.print("Enter your name: "); // ask user to put name value
					name = keyboard.nextLine(); // user puts name value
					obj.setName(name); // call setname to store the value
				}
				else if(obj.getState() == 1) { // or if getstate method value is 1
					System.out.print("Enter your age: "); // ask user to put age value
					age = keyboard.nextInt(); // user puts age value
					keyboard.nextLine(); // removing the space buffer
					obj.setAge(age); // call setage to store the value
				}
				else if(obj.getState() == 2) { // or if getstate method value is 2
					System.out.print("Enter your race: "); // ask user to put race value
					race = keyboard.nextLine(); // user puts race value
					obj.setRace(race); // call setrace method to store the value
				}
			}
			catch(Exception e) { // when exception occurs, it happens exception
				System.out.println(e.getMessage()); // print the specific statement with calling getmeesage method
				continue; // keep executing while loop with skipping the remaining part of the while loop
			}
		}
	}
}
