package edu.handong.csee.java.exceptionhandle.example.prob3;

import java.util.Scanner;

public class Prob3 {

	public static final Powercalc myCalculator = new Powercalc();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter two inegers to execute pow method: ");
		while(in.hasNextInt()) {
					
			int n = in.nextInt();
			int p = in.nextInt();
			try {
				System.out.println(myCalculator.power(n, p));
				System.out.println("Enter two inegers to execute pow method: ");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

