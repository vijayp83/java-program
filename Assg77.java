package MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assg77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int size = s.nextInt();
		
		int ar1[] = new int[size];
		
		for(int i=0; i<ar1.length;i++)
		{
			System.out.println("Enter the values of array1");
			ar1[i] =s.nextInt();
		}
		System.out.println("Enter the size of array2");
		int size1 = s.nextInt();
		int ar2[]= new int[size1];
		for(int i=0;i<ar2.length;i++)
		{
			System.out.println("Enter the values os array 2");
			ar2[i] = s.nextInt();
		}
		
		boolean same = Arrays.equals(ar1, ar2);
		System.out.println(same);
		
		
		
		

	}

}
