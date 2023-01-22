package oop2;

import oop1.Addition;

public class Multiplication extends Addition{
	
	void multiply (int a, int b) {
		
		int m = a*b;
		
		System.out.println(m);
		
	}
	
	public static void main(String[]args) {
		
		Multiplication m1 = new Multiplication();
		
		m1.multiply(10, 10);
		
		
	}
}
