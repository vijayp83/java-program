package MKT;

import java.util.Scanner;

public class Assignment35 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double pi = Math.PI;
		
		System.out.println("Enetr radius value");
		
		int radius = s.nextInt();
		
		System.out.println("The circuferance of circel -> " + 2*pi*radius);
	}

}
