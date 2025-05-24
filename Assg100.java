package MKT;

import java.util.Enumeration;
import java.util.Vector;

public class Assg100 {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(122);
		v.add("Vijay");
		v.add('M');
		v.add(true);
		v.add(null);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
