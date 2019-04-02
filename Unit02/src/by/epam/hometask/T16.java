package by.epam.hometask;

public class T16 {

	public static void main(String[] args) {
		int x=1334;
		int a;
		int b;
		int c;
		int d;
		int y;
		a=x%10;
		b=(x-a)%100/10;
		c=(x-a-b)%1000/100;
		d=(x-a-b-c)%10000/1000;
		y=a*b*c*d;
		System.out.println(y);

	}

}
