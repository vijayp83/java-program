package MKT;

import java.util.Scanner;

public class Assg71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.next();
		
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
		if(name.equals(rev))
		{
			System.out.println("The string is palindrome");
		}
		
		else
		{
			System.out.println("The string is not palindrome");
		}

	}

}
