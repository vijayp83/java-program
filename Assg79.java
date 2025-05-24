package MKT;

import java.util.Arrays;

public class Assg79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar1 = {45,32,67,12};
		
		int[] ar2 = new int[ar1.length];
		
		for (int i =0,j=ar1.length-1;i<ar1.length;i++,j--)
		{
			ar2[j]=ar1[i];
		}
				
		System.out.println(Arrays.toString(ar2));
	}

}
