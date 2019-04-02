package by.epam.hometask;

public class T28 {

	public static void main(String[] args) {
		double rad=1;
		double gr;
		int g;
		int m;
		double s;
		
		gr=rad*180/Math.PI;
		g=(int)gr;
		gr=gr-g;
		s=(gr*60*60)%60;
		m=(int)((gr*60*60-s)/60);
		
		System.out.println(rad+" радиан = "+g+"гр"+m+"мин"+s+"сек");
		

	}

}
