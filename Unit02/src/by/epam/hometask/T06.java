package by.epam.hometask;

public class T06 {

	public static void main(String[] args) {
		int n=5;//количество малых бидонов
		int m=6;//количество больших бидонов
		double a;//Количество молока в 1 малом бидоне
		double b;//Количество молока в 1 большом бидоне
		double x;//количество молока в m больших бидонов
		
		System.out.println("Малых бидонов: "+n);
		System.out.println("Больших бидонов: "+m);
				
		a=80/n;
		b=a+12;
		x=b*m; 
		
		System.out.println("В "+m+" больших бидонах "+x+" литров молока");

	}

}
