package by.epam.hometask;

public class T32 {

	public static void main(String[] args) {
		int m=23;//показание часов ч
		int n=59;//показание часов мин
		int k=59;//показание часов с
		int p=3;//добавили ч
		int q=15;//добавили мин
		int r=15;//добавили с
		int t1; //начальное время в секундах
		int t2;//добавленное время в секундах
		int t3;//конечное время в секундах
		
		t1=m*60*60+n*60+k;
		t2=p*60*60+q*60+r;
		t3=t1+t2;
		k=t3%60;
		n=((t3-k)/60)%60;
		m=(t3-k-n*60)/(60*60)%24;
		
		System.out.println("финальное время "+m+" ч "+n+" мин "+k+" c ");

	}

}
