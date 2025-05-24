package MKT;

import java.util.Scanner;

public class Assg75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr array number");
		
		int size = s.nextInt();
		int sum =0;
		
		
		int[] ar = new int[size];
		
		for(int i = 0; i<ar.length;i++)
		{
			ar[i] = s.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		
		int avg = sum/ar.length; 
		System.out.println(avg);
		

	}

}
