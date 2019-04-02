package by.epam.hometask;

public class T34 {

	public static void main(String[] args) {
		double A=74183954;
		double B;//в килобайтах
		double C;//в мегабайтах
		double D;//в гигабайтах
		double E;//в терабайтах
		
		B=A/1024;
		C=B/1024;
		D=C/1024;
		E=D/1024;
        
		System.out.println(A+" байт");
		System.out.println(B+" килобайт");
		System.out.println(C+" мегабайт");
		System.out.println(D+" гигабайт");
		System.out.println(E+" терабайт");
	}

}
