package MKT;

import java.util.ArrayList;
import java.util.Collection;

public class Assg89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c =new ArrayList();
		c.add("Vijay");
		c.add("Pattar");
		c.add("Yamanur");
		c.add("582208");
		c.add('M');
		c.add("9686****83");
		c.remove("Vijay");
		boolean s = c.contains("582208");
		System.out.println(s);
		System.out.println(c);
		
	}

}
