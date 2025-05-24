package MKT;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Assg62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter number");
			int a = s.nextInt();
			System.out.println("Enter number");
			int b = s.nextInt();
			
			try {
				double c = a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e) {
				System.out.println("syntax error");
			}
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("enter numeric number only");
		}
		
		
		
	}

}
