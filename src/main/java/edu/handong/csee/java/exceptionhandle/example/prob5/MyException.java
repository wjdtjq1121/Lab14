package edu.handong.csee.java.exceptionhandle.example.prob5; // set the package where this belongs to

public class MyException extends Exception{ // a class which can access from other package, inherits exception class

	private String message = null; // declare message member as null

	public MyException() { // constructor, executed when instance is created
		super(); // a parent constructor is executed
	}

	public MyException(String message) // constructor, has message input value
	{
		super(message); // a parent constructor is executed
		this.message = message; // stores input value in message member
	}
	public MyException(Throwable cause) // constructor, has cause input value
	{
		super(cause); // a parent constructor is executed
	}
	public String toString() // has tostring method, no input value, has return value type is string
	{
		return message; // return message member value
	}
}
