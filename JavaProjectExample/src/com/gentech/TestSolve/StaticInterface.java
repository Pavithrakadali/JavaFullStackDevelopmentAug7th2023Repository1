package com.gentech.TestSolve;

interface Month
{
	static void displayMonth()
	{
		System.out.println(" September");
	}
	
	default void ShowWeek()
	{
		System.out.println(" Sunday");
	}
}

class displayDetails implements Month
{
	
}
public class StaticInterface {

	public static void main(String[] args) 
	{
		displayDetails obj=new displayDetails();
		Month.displayMonth();
		obj.ShowWeek();
	}

}
