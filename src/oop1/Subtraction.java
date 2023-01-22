package oop1;

public class Subtraction extends Addition{
	
	int x;
	int y;
	
	void sub() {
	
		int s = x-y;
		
		System.out.println(s);
		
	}
	
	int sub(int a, int b, int c) {
		
		int s = a-b-c;
		return s;
		
	}
	
	void add (double a, double b) {
		
		double sum = a+b;
		System.out.println(sum);
		
	}
	
	public static void main(String[]args) {
		
		Subtraction s1 = new Subtraction();
		
		s1.x = 100;
		s1.y = 50;
		s1.sub();
	System.out.println(	s1.sub(100,25,25));
		s1.add(10.75, 10.35);
		s1.add(10, 10);
		
		
	}

}
