package oop1;

public class Addition {
	
	void add (int a, int b) {
		
		int sum = a+b;
		
		System.out.println(sum);
		
	}
	
	int add (int a, int b, int c) {
		
		int sum = a+b+c;
		
		return sum;
		
	}

	void add (double a, double b) {
		
		double sum = a+b;
		System.out.println(sum);
		
	}
	
	public static void main (String[]args) {
		
		Addition a1 = new Addition();
		
		a1.add(10, 10);
		System.out.println(a1.add(10, 10, 10));
		a1.add(10.75, 10.50);
		
	}
}
