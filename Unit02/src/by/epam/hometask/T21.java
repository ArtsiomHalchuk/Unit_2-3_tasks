package by.epam.hometask;

public class T21 {

	public static void main(String[] args) {
		double R=333.444;
		double r;
		double temp1;
		double temp2;
				
		temp1=(R*1000)%1000;
		temp2=(R*1000-temp1)/1000;
		r=(temp1*1000+temp2)/1000;
		System.out.println("r="+r);

	}

}
