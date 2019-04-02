package by.epam.hometask;

public class T22 {

	public static void main(String[] args) {
		int T=58692;
		int H;
		int M;
		int S;
		
		H=T/60/60;
		S=T%60;
		M=((T-S)/60%60);
		
		
		System.out.println(H+"ч"+M+"мин"+S+"с");

	}

}
