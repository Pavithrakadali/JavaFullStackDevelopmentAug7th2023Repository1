package com.gentech.test3;

/* 2,3,4
 * 5,6,6
 * 5,2,3  */

//4

class Transpose2
{
		
	static
	{
		int i,j;
		int a[][]={{2,3,4},{5,6,6},{5,2,3}};
		
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a[i].length;j++)
			{
			
				System.out.print(" "+a[j][i]);
			}
			System.out.println();
		}
	}
}

public class transpose1 {

	public static void main(String[] args) {
		
		
		Transpose2 t1=new Transpose2();
		
	}

}
