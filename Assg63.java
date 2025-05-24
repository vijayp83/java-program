package MKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assg63 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try
		{
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the value of index");
			int[] a =new int [s.nextInt()];	
		}
		
		catch(InputMismatchException e)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value in integer");
			
			int[] a =new int [s.nextInt()];
		}

	}

}
