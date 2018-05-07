package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary {

	private static int [] arr = new int[5];
	private static int count = 0;
	public void receive(int num) throws ArrayIndexOutOfBoundsException
	{
		int i = count;
		arr[i] = num;
		count++;
		System.out.printf("arr[%d] <- %d\n", i, num);
	}	
}
