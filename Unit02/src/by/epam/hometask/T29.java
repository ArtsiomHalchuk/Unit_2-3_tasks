package by.epam.hometask;

public class T29 {

	public static void main(String[] args) {
		double a=3;
		double b=3;
		double c=3;
		
		double xr;
		double yr;
		double zr;
		double xg;
		double yg;
		double zg;
		
		xr=Math.acos((a*a+b*b-c*c)/(2*a*b));
		yr=Math.acos((a*a+c*c-b*b)/(2*a*c));
		zr=Math.acos((c*c+b*b-a*a)/(2*c*b));
		xg=xr*180/Math.PI;
		yg=yr*180/Math.PI;
		zg=zr*180/Math.PI;
		
		System.out.println("x в радианах ="+xr);
		System.out.println("y в радианах ="+yr);
		System.out.println("z в радианах ="+zr);
		System.out.println("x в градусах ="+xg);
		System.out.println("y в градусах ="+yg);
		System.out.println("z в градусах ="+zg);
	}

}
