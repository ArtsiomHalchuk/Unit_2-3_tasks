package by.epam.hometask;

public class T17 {

	public static void main(String[] args) {
		double a=2;
		double b=3;
		System.out.println("a="+a);
		System.out.println("b="+b);		
		double x;//среднее арифметическое кубов
		double y;// среднее геометрическое модулей
		
		x=(Math.pow(a, 3)+Math.pow(b, 3))/2;
		y=Math.sqrt((Math.abs(a)*Math.abs(b)));
		
		System.out.println("Среднее арифметическое кубов равно "+x);
		System.out.println("Среднее геометрическое модулей равно "+y);
	}
}
