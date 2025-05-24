package MKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assg66 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a =s.nextInt();	
			System.out.println("Enter the value of b");
			int b =s.nextInt();	
			int c = a/b;
			System.out.println(c);		
		}
		
		catch(InputMismatchException e)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value in integer");
			int a =s.nextInt();	
			System.out.println("Enter the value of b");
			int b =s.nextInt();	
			int c = a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			Scanner s = new Scanner(System.in);
		
			System.out.println("Please enter the correct value");
			int a = s.nextInt();
			System.out.println("Enter the value of b");
			int b =s.nextInt();	
			int c = a/b;
			System.out.println(c);
			
			
		}
		
	}


}
