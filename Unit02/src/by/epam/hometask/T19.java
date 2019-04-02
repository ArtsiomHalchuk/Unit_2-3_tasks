package by.epam.hometask;

public class T19 {

	public static void main(String[] args) {
		double a=3;
		double s;//площадь
		double h;//высота
		double r1;//радиус вписанной окружности
		double r2;//радиус описанной окружности
		
		h=Math.sqrt(3)/2*a;
		s=0.5*a*h;
		r1=a/Math.sqrt(12);
		r2=a/Math.sqrt(3);
		
		System.out.println("S="+s);
		System.out.println("h="+h);
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		
	}

}
