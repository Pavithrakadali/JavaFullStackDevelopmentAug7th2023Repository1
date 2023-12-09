package com.gentech.test3;

//3
class StaticDemo
{

	int y=213;
	int x=21;

	
	static int a=10;
	static int b=5;
}

class DEmo9
{

	DEmo9()
	{
		StaticDemo o1=new StaticDemo();
		int sum=o1.x+o1.y;

		int product =StaticDemo.a*StaticDemo.b;
		
		System.out.println("sum"+sum);
		System.out.println(product);

	}


}


public class staticBock {

	public static void main(String[] args) {
		DEmo9 st=new  DEmo9();

	}

}
