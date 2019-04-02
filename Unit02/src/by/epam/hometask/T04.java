package by.epam.hometask;

import java.util.Scanner;

public class T04 {

	public static void main(String[] args) {
		System.out.println(" z = ( (a – 3 ) * b / 2) + c \n"); 

		//variables
		double z;
		double a;
		double b;
		double c;
		
		//keyboard input of argument a
				Scanner sc= new Scanner(System.in); 
				System.out.print("Введите значение аргумента a:\n > ");
				while (sc.hasNextDouble()==false) {
					
					sc.next();
					System.out.print("> ");
				}
				a=sc.nextDouble();
		
		//keyboard input of argument b
		System.out.print("Введите значение аргумента b:\n > ");
		while (sc.hasNextDouble()==false) {
			sc.next();
			System.out.print("> ");
		}
		b=sc.nextDouble();
		
		//keyboard input of argument c
		System.out.print("Введите значение аргумента c:\n > ");
		while (sc.hasNextDouble()==false) {
			sc.next();
			System.out.print("> ");
		}
		c=sc.nextDouble();
		
		//function calculating and output
		z = ((a-3)*b/2)+c;
		System.out.println("Z="+z);
		
	}

}
