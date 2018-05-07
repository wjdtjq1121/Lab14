package edu.handong.csee.java.exceptionhandle.example.prob2; // set the package where this belongs to

public class Prob2 { // a class which can access from other package

	public static void main(String[] args) // a void method, invoked by the system
	{
		int x; // declare x member
		int y; // declare y member

		In_exception test = new In_exception(); // creating thing so we can use inexception class
		test.errorDetect(); // calling errordetect method
	}

}
