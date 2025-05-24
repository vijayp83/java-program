package MKT;

import java.util.Scanner;

public class Assignment37 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter width of Rectangle");
		
		int width = s.nextInt();
		
		System.out.println("Enter length of Rectangle");
		int length = s.nextInt();
		
		System.out.println("The Circuferance of Rectangle " + 2*width*length);
	}

}
