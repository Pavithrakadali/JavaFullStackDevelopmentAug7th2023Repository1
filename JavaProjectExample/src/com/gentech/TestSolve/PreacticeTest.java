package com.gentech.TestSolve;


class Animal {

	void display() {
		int k=0,l=0;
		//int x[][]= {{2,3,4},{4,5,6},{1,6,8}};
		int a[][]=new int [5][5];
		// return 1to 10 numbers 

		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				a[k][l]=i;
				k++;
				l++;
			}
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		//return a;
	}

	/*void show(int s)
	{
		System.out.println("s value : "+s);
	}	*/
}
public class PreacticeTest {

	public static void main(String[] args) {
		Animal obj =new Animal();
		obj.display();
		/*int s[][]=obj.display();
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
		System.out.print(" "+s[i][j]);
		}
			System.out.println();
		}*/
		//obj.show(s[2][2]);
	}
}
