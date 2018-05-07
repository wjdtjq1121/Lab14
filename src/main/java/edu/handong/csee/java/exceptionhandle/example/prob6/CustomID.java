package edu.handong.csee.java.exceptionhandle.example.prob6; // set the package where this belongs to

public class CustomID extends Exception{ // a class which can access from other package

	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"}; // delcare the array, array has three value 
	private String name = ""; // declare name member string type
	private int age = 0; // declare age member
	private String race = ""; //declare string race member
	private int state = 0; // declare state member

	public void setName(String str) throws Exception // setname method has string str input value no return type, throws exception
	{
		if(str.length() < 5) { // condition if str length is less than 5
			state = 0; // state member value is 0
			throw new Exception("Your name is short! Try again!"); // throws exception with specific statement
		}
		else { // otherwise
			this.name = str; // stores str value in name member
			System.out.println("Name is valid"); // print the specific message
			System.out.println("Name: " + this.name); // print the name member value
			state++; //  add 1 value in state member
		}
	}

	public void setAge(int num) throws Exception // setage method, num input value no return type, throws exception
	{
		if(num < 18) // condition if num is less than 18
		{
			state = 1; // state member is 1
			throw new Exception("You are too young! Try again"); // throws exception with the specific statement
		}
		else { // otherwise
			this.age = num; // stores num value in age member
			System.out.println("Age is valid"); // print the specific statement
			System.out.println("Age: " + this.age); // print age member value
			state++; // add 1 value in state
		}		
	}

	public void setRace(String race) throws Exception // setrace method no return type race input value, throws exception
	{
		for(int i=0; i<races.length; i++) // executing for loop from 0 to race length
		{
			if(races[i].equals(race)) { // condition if array races index is equal to race array 
				this.race = races[i]; // stores the specific races index in race member
				System.out.println("Race is valid"); // print the specific statement
				System.out.println("Race: " + races[i]); // print race string value in races index
				state = 0; // state member is zero
				return; // end the method
			}
		}
		state = 2; // state member value is 2
		throw new Exception("Human! Try again."); // throw exception with specific statement
	}
 
	public int getState() // getstate method no input value, has return value type int
	{
		return state; // return state member value
	}
}
