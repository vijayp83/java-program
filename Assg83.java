package MKT;

import java.util.Arrays;

public class Assg83 {

	public static void main(String[] args) {
		
		String s = "vijay * pattar 83 @gmail.com ";
		
		char[] vp = s.toCharArray();
		System.out.println(Arrays.toString(vp));
		
		int alphabetic = 0;
		int digit = 0;
		int space = 0;
		int special = 0;
		
		for(int i=0;i<=vp.length-1;i++)
		{
			boolean alp = Character.isAlphabetic(vp[i]);
			boolean dig	=	Character.isDigit(vp[i]);
			boolean spc	= Character.isWhitespace(vp[i]);
			
			if(alp==true) {
				alphabetic++;	
			}
			if(dig==true) {
				digit++;
			}
			if(spc==true) {
				space++;
			}
		}
		System.out.println(alphabetic);
		System.out.println(digit);
		System.out.println(space);
		special = vp.length-(alphabetic+digit+space);
		System.out.println(special);

	}

}
