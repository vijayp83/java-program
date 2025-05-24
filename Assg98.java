package MKT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assg98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Map<Integer,String> m = new HashMap();
		System.out.println("Enter size");
		int size = s.nextInt();
		s.nextLine();
		
		for(int i=0;i<=size-1;i++ )
		{
			System.out.println("Enetr account number");
			int acc= s.nextInt();
			s.nextLine();
			
			System.out.println("Enter holder name4");
			String name = s.next();
			s.nextLine();
			
			m.put(acc, name);
			
		}
		
		System.out.println(m);
		
		

	}

}
