package edu.handong.csee.java.exceptionhandle.example.prob4; // set the package where this belongs to

public class Boundary { // a class which can access from other package

	private static int [] arr = new int[5]; // declare private static array, the size if 5
	private static int count = 0; // declare count memeber
	public void receive(int num) throws ArrayIndexOutOfBoundsException // receive method, no return type, has num input value has throw condition
	{
		int i = count; // declare i member, store count value
		arr[i] = num; // store num value in specific arr position
		count++; // add 1 value in count member
		System.out.printf("arr[%d] <- %d\n", i, num); // print each array index value and num
	}	
}
