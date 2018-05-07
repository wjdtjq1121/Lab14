package edu.handong.csee.java.exceptionhandle.example.prob6;

public class CustomID extends Exception{

	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"};
	private String name = "";
	private int age = 0;
	private String race = "";
	private int state = 0;

	public void setName(String str) throws Exception
	{
		if(str.length() < 5) {
			state = 0;
			throw new Exception("Your name is short! Try again!");			
		}
		else {
			this.name = str;
			System.out.println("Name is valid");
			System.out.println("Name: " + this.name);
			state++;
		}
	}

	public void setAge(int num) throws Exception
	{
		if(num < 18)
		{
			state = 1;
			throw new Exception("You are too young! Try again");
		}
		else {
			this.age = num;
			System.out.println("Age is valid");
			System.out.println("Age: " + this.age);
			state++;
		}		
	}

	public void setRace(String race) throws Exception
	{
		for(int i=0; i<races.length; i++)
		{
			if(races[i].equals(race)) {
				this.race = races[i];
				System.out.println("Race is valid");
				System.out.println("Race: " + races[i]);
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again.");		
	}

	public int getState()
	{
		return state;
	}
}
