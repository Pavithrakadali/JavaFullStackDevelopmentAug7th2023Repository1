package com.gentech.test3;

//10

class Mydetails
{


	void showname()
	{
		String name="sindhu";
		System.out.println(name);
	}

	static void display()
	{
		int age=8;
		System.out.println(age);

	}

	Mydetails()
	{

		showname();

		display();
	}

}

public class question10 {

	public static void main(String[] args) {

		Mydetails obj=new Mydetails();
	}

}
