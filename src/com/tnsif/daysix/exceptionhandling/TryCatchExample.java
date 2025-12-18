package com.tnsif.daysix.exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int performDivision(int x, int y) {
			System.out.println("I am in performDivision method");
			int z = 0;
			z = x / y;
			return z;
		}

		static float performDivision(float a, float b) {
			return a / b;
		}

		

	}

}
