package by.epam.hometask;

public class T10 {

	public static void main(String[] args) {
		double x=30;//значения в радианах
		double y=60;//значения в радианах
		double z;
		
		z= (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan((x)*(y));
		//step by step variant
		/*double temp1;
		double temp2;
		double temp3;
		double temp4;
		double temp5;
		temp1=Math.sin(x);
		temp2=Math.cos(y);
		temp3= Math.cos(x);
		temp4=Math.sin(y);
		temp5=Math.tan(x*y);
		z=(temp1+temp2)/(temp3-temp4)*temp5;
		*/
		
		System.out.println("Z="+z);

	}

}
