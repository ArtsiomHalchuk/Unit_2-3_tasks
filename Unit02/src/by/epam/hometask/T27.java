package by.epam.hometask;

public class T27 {

	static double a=2;
	
	public static void main(String[] args) {
		first();
		second();

	}
	public static void first() {
		double b=a;
		b=b*b;
		b=b*b;
		b=b*b;
		System.out.println("a^8="+b);
	}
	public static void second() {
		double b;
		double c;
		b=a*a;
		c=b*b;
		c=c*c;
		c=c*b;
		System.out.println("a^10="+c);
		
	}

}
