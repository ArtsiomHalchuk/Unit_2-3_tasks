package by.epam.hometask;

public class T33 {

	public static void main(String[] args) {
		String text="qwertyuiopasdfghjkl";
		char symbol='a';
		int i=0;
		char symbol1=text.charAt(i);
		char symbol2;
		char symbol3;
//		boolean comp=symbol1==symbol;
		while((symbol1==symbol)==false){
			i++;
			symbol1=text.charAt(i);
		}
		System.out.println("Порядковый номер символа "+symbol+" - "+(i+1));
		symbol2=text.charAt(i-1);
		System.out.println("Предыдущий символ это "+ symbol2);
		symbol3=text.charAt(i+1);
		System.out.println("Следующий символ это "+ symbol3);
		
	}

}
