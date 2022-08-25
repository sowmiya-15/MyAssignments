package week2.day1;

public class calc1 {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public void sub(int add,int b) {
		int c=add-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		calc1 calc=new calc1();
		int add = calc.add(30,10);
		System.out.println(add);
		calc.sub(add,10);
		
	}
		
	}

 
