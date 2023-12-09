package com.gentech.TestSolve;

class D3
{
	D3(String Cname)
	{
		System.out.println("Customer Name : "+Cname);
	}
	
	D3(String Name,int age)
	{
		this("Adams");
		System.out.println("Customer Name : "+Name+ " "+age);
	}
	
	D3(int  cusid)
	{
	this("mani",987);
		System.out.println("Customer ID : "+cusid);
	}
	
	D3(int  cusid,Double age)
	{
	this(56);
		System.out.println("Customer ID : "+cusid+" "+age);
	}
	
	D3()
	{
		System.out.println("NO args COnstructor ");
	}
	
}                                                                                                   
public class ConstructorChaining {

	public static void main(String[] args) {
		
		D3 
		o =new D3(568,9.7);
		
	}

}
