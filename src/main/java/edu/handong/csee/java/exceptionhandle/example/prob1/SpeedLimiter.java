package edu.handong.csee.java.exceptionhandle.example.prob1; // set the package where this belongs to

public class SpeedLimiter { // a class which can access from other package

	private int speed = 0; // declare speed memeber
	private int limit = 0; // declare limit member

	public SpeedLimiter(int limit, int speed) { // constructor, has two inputs, executed when instance is created
		this.limit = limit; // stores input value in limit member
		this.speed = speed; // stores speed value in speed member

	}

	public void warnSpeedLim() // a void method, no return and input value
	{

		try { // test if exception occurs
			if(this.speed > this.limit) // condition if speed value is higher than limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); // an exception when it happens		
			}
			System.out.println("You are a low abiding citizen"); // otherwise this statement prints out
		}catch(Exception e) { // exception thrown, it happens
			System.out.println(e.getMessage()); // print the message, it calls getMessage method.
			System.out.println("You are being fined. "); // print the specific statement
		}
		System.out.println("Your current speed: " + this.speed); // print the specific statement, showing current speed
	}
}


