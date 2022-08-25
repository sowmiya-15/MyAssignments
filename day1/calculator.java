package week2.day1;


public class calculator{
	public void add() {
		int a=12;
		int b=15;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=50;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public void div() {
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
				
	}
	
		
		
	}


