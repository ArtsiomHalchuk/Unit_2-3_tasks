package by.epam.hometask;

import java.util.Scanner;

public class T03 {
public static void main(String[] args) {
	System.out.println(" z = 2 * x + ( y – 2 ) * 5. \n");
	
	//variables
	double z;
	double x;
	double y;
	
	//keyboard input of argument X
		Scanner sc= new Scanner(System.in); 
		System.out.print("Введите значение аргумента X:\n > ");
		while (sc.hasNextDouble()==false) {
			
			sc.next();
			System.out.print("> ");
		}
		x=sc.nextDouble();
		
	//keyboard input of argument Y
				System.out.print("Введите значение аргумента Y:\n > ");
				while (sc.hasNextDouble()==false) {
					
					sc.next();
					System.out.print("> ");
				}
				y=sc.nextDouble();
				
	//function calculating and output
		z=2*x+(y-2)*5;
		System.out.println("Z="+z);
}
}
