package com.gentech.TestSolve;

class Maths1 {
	static Maths1 obj = null;

	private Maths1() {
		// it is a private constructor
	}

	void addition(int x, int y) {
		int res = (x + y);
		System.out.println(" Addition result : " + res);
	}

	void multiplication(int x, int y) {
		int res = (x + y);
		System.out.println(" multiplication result : " + res);
	}

	public static Maths1 getInstance() {
		if (obj == null) {
			obj = new Maths1();
		}
		return obj;
	}
}

public class AfterApplyingSingleton {
	public static void main(String[] args) {
		Maths1 o1 = Maths1.getInstance();
		o1.addition(10, 20);
		o1.multiplication(20, 10);

		Maths1 o2 = Maths1.getInstance();
		o2.addition(10, 20);
		o2.multiplication(10, 10);

		Maths1 o3 = Maths1.getInstance();
		o3.addition(30, 2);
		o3.multiplication(50, 6);

		Maths1 o4 = Maths1.getInstance();
		o4.addition(11, 15);
		o4.multiplication(10, 10);

		Maths1 o5 = Maths1.getInstance();
		o5.addition(140, 50);
		o5.multiplication(5, 10);

		Maths1 o6 = Maths1.getInstance();
		o6.addition(302, 22);
		o6.multiplication(14, 6);

		if (o1 == o2 && o2 == o3 && o3 == o4 && o4 == o5 && o5 == o6) {
			System.out.println("Acheived singleton design pattern");
		} else {
			System.out.println("NOt Acheived singleton design pattern");}}}
