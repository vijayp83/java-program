package MKT;

import java.util.Arrays;

public class Assg82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "cat";
		String s2 = "act";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("length are not same");
		}
		
		char[] c1 = s1.toCharArray();
		
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		
		
		
		if (Arrays.equals(c1, c2))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		

		
		

	}

}
