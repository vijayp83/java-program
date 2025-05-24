package MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assg80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		

	}

}
