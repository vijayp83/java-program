package MKT;

import java.util.Scanner;

public class Assg106 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter switch number");
		int value = s.nextInt();
		
		switch(value)
		{
		case 1:
		{
			System.out.println("1st switch selected");
			break;
		}
		case 2:
		{
			System.out.println("2nd switch selected");
			break;
		}
		case 3:
		{
			System.out.println("3rd switch selected");
			break;
		}
		default: 
		{
			System.out.println("no switch are selected");
		}
	
		}
	}

}
