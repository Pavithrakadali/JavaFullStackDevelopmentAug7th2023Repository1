package com.gentech.test3;


//2

class maths2
{

	void showresult()
	{
	int a=2;
	int b=4;
	int sum=a+b;
	System.out.println("sum :"+sum);
	}
	
	void display()
	{
		{
			int a=6;
			int b=5;
			int product=a+b;
			System.out.println("product :"+product);
			}
	}
	
}

class result1
{
	result1()
	{
		maths2 m1=new maths2();
		m1.showresult();
		m1.display();
	}
	
}

public class Question2 {

	public static void main(String[] args) {
		result1 r1=new result1();
	}

}
