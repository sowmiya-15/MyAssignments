                                                                                                                                                                 package Week4;

public class Bicycle extends Bike {
	public void applyBell() {
		System.out.println("applyBell");
	}
	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		b.applyBell();
		b.applyBreak();
	}

}
