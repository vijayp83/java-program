package MKT;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assg97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <String> s = new <String>TreeSet();
		s.add("Vijay");
		s.add("Riyaz");
		s.add("Prakash");
		s.add("Kiran");
		
		
		Iterator r = s.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		
		

	}

}
