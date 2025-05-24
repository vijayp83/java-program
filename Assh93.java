package MKT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assh93 {
	
	public static void main(String[] args) {
		
		List<Integer> r = new <Integer>ArrayList();
		r.add(25);
		r.add(19);
		r.add(29);
		r.add(85);
		r.add(97);
		r.add(28);
		
		int v = r.size();
		System.out.println(v);
		
		Iterator l = r.iterator();
		System.out.println("forword listing");
		while(l.hasNext())
		{
			System.out.println(l.next());
			//System.out.println(l.nextIndex());
		}
		
		r.clear();
		System.out.println(r);
		
	}

}
