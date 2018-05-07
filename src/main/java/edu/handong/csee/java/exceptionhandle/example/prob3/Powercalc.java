package edu.handong.csee.java.exceptionhandle.example.prob3; // set the package where this belongs to

public class Powercalc { // a class which can access from other package

	public long power(int n, int p) throws Exception // method has two input values and long type return value, also has exception
	{
		long result = 0; // declare result member, long type
		result = (long)Math.pow(n, p); // stores the result value, which has the value pow n,p

		if(n<0 || p<0) // condition if n or p is less than 0
		{
			throw new Exception("n or p should not be negative."); // throw exception for specific condition, has specific statement
		}
		if(n==0 && p == 0) // condition if both n and p are 0 
		{
			throw new Exception("n and p should not be zero."); // throw exception for specific condition, has specific statement
		}
		return result; // returns result value
	}


}
