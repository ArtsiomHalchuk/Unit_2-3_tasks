package by.epam.hometask;

public class T35 {

	public static void main(String[] args) {
		int M=182;
		int N=8;
		double x;
		int x1;
		int x2;
		
		
		x=(double)M/(double)N;
		x1=(int)(x*10)%10;
		x2=(int)x%10;
		
		System.out.println("M/N="+x);
		
		System.out.println("Cтаршая цифра дробной части M/N равна "+x1);
		System.out.println("Младшая цифра целой части M/N равна "+x2);

	}

}
