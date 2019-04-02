package by.epam.hometask;

public class T09 {

	public static void main(String[] args) {
		double a=1;
		double b=2;
		double c=3;
		double d=6;
		double x;
		
		x=((a/c)*(b/d))-((a*b-c)/(c*d));

		//step by step variant
		/*double temp1;
		double temp2;
		double temp3;
		
		temp1=a*b/c/d;
		temp2=a*b-c;
		temp3=c*d;
		x=temp1-temp2/temp3;
		*/
		
		System.out.println("X="+x);	
		}

}
