package MKT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assg91 {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("Vijay");
		c.add(86);
		c.add("pattar");
		c.add('K');
		c.add(912202321);
		
		 Iterator d= c.iterator();
		
		 while(d.hasNext())
		 {
			 System.out.println(d.next());
			 }
		
	}

}
