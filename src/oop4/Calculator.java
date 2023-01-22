package oop4;

import oop4.Calculator;

public class Calculator implements BasicCalc, AdvanceCalc {

	public static void main(String[] args) {
	
		Calculator c1 = new Calculator();
		c1.add(100, 20);
		c1.sub(200, 15);

	}

	@Override
	public void add(int a, int b) {
	
		int sum = a+b;
		System.out.println(sum);
		
	}

	@Override
	public void add(double a, double b) {
	
		double sum = a+b;
		System.out.println(sum);
	}

	@Override
	public void sub(int a, int b) {
	
		int sum = a-b;
		System.out.println(sum);
	}

	@Override
	public void sub(double a, double b) {
	
		double sum = a-b;
		System.out.println(sum);
	}

}

