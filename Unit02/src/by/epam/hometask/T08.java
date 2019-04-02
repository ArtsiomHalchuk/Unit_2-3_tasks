package by.epam.hometask;

public class T08 {

	public static void main(String[] args) {
		double a=1;
		double b=2;
		double c=3;
		double x;
		
		x=((b+Math.sqrt(b*b+4*a*c)))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
		
		
		//step by step variant
		
		/*double temp1;
		double temp2;
		double temp3;
		double temp4;
		double temp5;
		
		temp1=b*b+4*a*c;
		temp2=Math.sqrt(temp1)+b;
		temp3=2*a;
		temp4=Math.pow(a, 3)*c;
		temp5=Math.pow(b, -2);
		
		x=temp2/temp3-temp4+temp5;
		*/
		
	
		
System.out.println("X="+x);

	}

}
