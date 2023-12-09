package com.gentech.test3;

//9
class Examp12
{
	void DisplayResult()
	{
		Examp12 e=new Examp12();
		
		int a=5;
		int b=6;
		int prd=a*b;
		System.out.println("Product :"+prd);
	}
	
	static
	{
		
		//e.DisplayResult();
		
		String course="Full stack";	
		System.out.println("course :"+course);
	}

}
public class Ques9 {

	public static void main(String[] args) {
		Examp12 obj=new Examp12();
		obj.DisplayResult();
	}

}
