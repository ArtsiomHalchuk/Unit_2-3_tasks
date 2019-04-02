package by.epam.hometask;

import java.util.Scanner;

public class T02 {
public static void main (String[] aregs) {
	System.out.print("C=3+a\n\n");
	
	
	//variables
	double a; 
	double c;

	//keyboard input of argument
	Scanner sc= new Scanner(System.in); 
	System.out.print("Введите значение аргумента a:\n > ");
	while (sc.hasNextDouble()==false) {
		
		sc.next();
		System.out.print("> ");
	}
	a=sc.nextDouble();
	
	
	//function calculating and output
	c=a+3;
	System.out.println("C="+c);
	
}
}
