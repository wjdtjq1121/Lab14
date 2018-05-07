package edu.handong.csee.java.exceptionhandle.example.prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num=0;
		Boundary arr = new Boundary();
		boolean repeat = true;
		while(repeat)
		{
			try
			{
				System.out.print("Enter an integer: ");
				num = keyboard.nextInt();
				arr.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid array index access!");
				repeat = false;
			}
		}
	}

}
