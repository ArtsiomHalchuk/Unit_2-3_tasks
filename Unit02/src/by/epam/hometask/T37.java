package by.epam.hometask;

public class T37 {

	public static void main(String[] args) {
		int N1=44;
		int N2=1221;
		int N3=124;
		double X4=9;double Y4=3;double M4=8;double N4=9;
		int N5=123;
		double a6=3; double b6=2; double c6=2;
		int N7=123; int a7;int b7;int c7;
		double N8=16; double a8=2;
		double m9=2; double n9=3; double a9=4; double b9=5; double c9=6;

		boolean B1;
		boolean B2;
		boolean B3;
		boolean B4;
		boolean B5;
		boolean B6;
		boolean B7;
		boolean B8=false;
		boolean B9;
		
		B1= (N1%2==0) && (N1/10>0) & (N1/100==0);
		B2= (int)(N2/1000)+(int)((N2/100)%10)==(int)((N2/10)%10)+(int)(N2%10);
		B3= ((int)(N3/100)+(int)((N3/10)%10)+(int)(N3%10))%2==0;
		B4= X4 >= M4 && X4<=N4;
		B5= N5*N5==Math.pow(((int)(N5%10)+(int)((N5/10)%10)+(int)(N5/100)), 3);
		B6= a6==b6 || a6==c6 || b6==c6;
			a7=(int)(N7/100);
			b7=(int)((N7/10)%10);
			c7=(int)N7%10;
		B7=a7+b7==c7||a7+c7==b7||b7+c7==a7;
				int i=0;
				while (i<5 && B8==false) {
					B8=Math.pow(a8, i)==N8;
					i++;
				}
		B9= m9==a9*n9*n9+b9*n9+c9;
		
				
		System.out.println("Целое число "+N1+" является четным двузначным числом.  "+B1);
		System.out.println("Сумма двух первых цифр заданного четырехзначного числа "+N2+" равна сумме двух его последних цифр  "+B2);
		System.out.println("Сумма цифр данного трехзначного числа "+N3+" является четным числом.  "+B3);
		System.out.println("Точка с координатами ("+X4+","+Y4+") принадлежит части плоскости, лежащей между прямыми х="+M4+", х="+N4+"  "+B4);
		System.out.println("Квадрат заданного трехзначного числа "+N5+" равен кубу суммы цифр этого числа  "+B5);
		System.out.println("Треугольник со сторонами а="+a6+",b="+b6+",с="+c6+" является равнобедренным.  "+B6);
		System.out.println("Сумма каких-либо двух цифр заданного трехзначного натурального числа "+N7+" равна третьей цифре.  "+B7);
		System.out.println("Заданное число "+N8+" является степенью числа "+a8+" (показатель степени может находиться в диапазоне от 0 до 4)  "+B8);
		System.out.println("График функции у = "+a9+"х^2 + "+b9+"х+ "+c9+" проходит через заданную точку с координатами ("+m9+","+n9+")  "+B9);
		
	}

}

