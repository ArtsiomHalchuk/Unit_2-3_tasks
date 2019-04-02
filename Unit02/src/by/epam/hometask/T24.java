package by.epam.hometask;

public class T24 {

	public static void main(String[] args) {
		double a=5;
		double b=10;
		double alpha=60;//угол при большей стороне
		double S;
		
		if (a>b) {
			S= (a*a-b*b)/4*Math.tan(alpha);
		}
		else {
			if(a<b) {
				S=(b*b-a*a)/4*Math.tan(alpha);
			}
			else {
				S=0;
				System.out.println("Ошибка ввода, a=b");
			}
			
		}
		System.out.println("S="+S);
	}
}
