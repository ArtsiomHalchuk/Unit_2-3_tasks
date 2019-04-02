package by.epam.hometask;

public class T36 {

	public static void main(String[] args) {
		int x=1234;
		int tempx;
		int n;//цифра
		int a=1;//произведение четных цифр
		int b=1;//произведение нечетных цифр
		double c;//частное произведения четных и нечетных цифр
		int i=1;
		
		
		while((i==10000)==false) {
		tempx=x/i;
//		System.out.println("X="+tempx);
		n=tempx%10;
//		System.out.println("n="+n);
		if(n%2==0) {
			a=a*n;
//			System.out.println("a="+a);
		}
		else {
			b=b*n;
//			System.out.println("b="+b);
		}	
		i=i*10;
//		System.out.println("i="+i);
		}
		
		c=(double)a/(double)b;
		
		System.out.println("Частное от произведений четных и нечетных цифр равно "+c);
		
			
	}

}
