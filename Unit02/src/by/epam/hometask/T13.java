package by.epam.hometask;

public class T13 {

	public static void main(String[] args) {
		double x1=1;
		double y1=1;
		double x2=2;
		double y2=5;
		double x3=5;
		double y3=3;
		double p;
		double s;
		
		double a;
		double b;
		double c;
		
		a=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		b=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		c=Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("P="+p);
        System.out.println("S="+s);
	}

}
