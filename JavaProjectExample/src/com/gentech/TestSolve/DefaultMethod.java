package com.gentech.TestSolve;


interface  Product
{
	default void showProductPrice(double price)
	{
		System.out.println("Product Price  : "+price);
	}
}

interface Order  
{
	default void showProductPrice11(double price)
	{

		System.out.println("Product as per Orders : "+price);
	}
}

class Acer implements Product,Order
{
	
	
	
}
public class DefaultMethod {

	public static void main(String[] args) {

		Acer obj =new Acer();
		//obj.showProductName("Acer Monitor");
		obj.showProductPrice(450.70);
	}

}
