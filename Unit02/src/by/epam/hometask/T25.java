package by.epam.hometask;

public class T25 {

	public static void main(String[] args) {
		double a=1;
		double b=20;
		double c=10;
		double D;
		double x1;
		double x2;
		
		D=b*b-4*a*c;
		x1=(-1*b-Math.sqrt(D))/(2*a);
		x2=(-1*b+Math.sqrt(D))/(2*a);
		System.out.println("D="+D);
		System.out.println("x1="+x1);
		System.out.println("x2="+x2);
		
	}

}
