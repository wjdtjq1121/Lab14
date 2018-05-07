package edu.handong.csee.java.exceptionhandle.example.prob6;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		String name;
		String race;
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		CustomID obj = new CustomID();
		boolean repeat = true;

		while(repeat)
		{
			try {
				if(obj.getState() == 0) {
					System.out.print("Enter your name: ");
					name = keyboard.nextLine();
					obj.setName(name);
				}
				else if(obj.getState() == 1) {
					System.out.print("Enter your age: ");
					age = keyboard.nextInt();
					keyboard.nextLine();
					obj.setAge(age);
				}
				else if(obj.getState() == 2) {
					System.out.print("Enter your race: ");
					race = keyboard.nextLine();
					obj.setRace(race);
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
