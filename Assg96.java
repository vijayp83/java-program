package MKT;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assg96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new <String>HashSet();
		s.add("Vijay");
		s.add("Riyaz");
		s.add("Kiran");
		
		
		
		Set<Integer> s1 = new <Integer> HashSet();
		s1.add(32);
		s1.add(56);
		s1.add(83);
		s1.contains(s);
		
		Iterator r = s1.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
		

	}

}
