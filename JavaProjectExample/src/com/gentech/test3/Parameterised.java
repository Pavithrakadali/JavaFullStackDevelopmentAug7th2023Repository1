package com.gentech.test3;

//7
class ConstuctorDemo
{


	{
		int regno=213;
		System.out.println("Pavithra");
		System.out.println("reg no"+regno);

	}

	static
	{

		int a=2;
		int b=4;
		int sum=a+b;
		System.out.println("sum :"+sum);

	}
}


class Execute1
{
	Execute1(int x,int y)
	{
		ConstuctorDemo con=new ConstuctorDemo();

		int Product=x*y; 
		System.out.println(Product);
	}
}

public class Parameterised {

	public static void main(String[] args) {

		Execute1 obj=new Execute1(5,6);

	}

}
