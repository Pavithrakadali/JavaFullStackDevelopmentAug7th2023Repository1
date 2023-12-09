package com.gentech.test3;


//6

class Demo5
{

	static
	{
		String college="SSA";	
		System.out.println("College:"+college);
	}

}


class Example1
{
	
	static
	{
		Demo5 o1=new Demo5();
		
		String course="BCA";	
		System.out.println("course:"+course);
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		Example1 emp=new Example1();
	}

}
