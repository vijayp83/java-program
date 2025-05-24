package MKT;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assg94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> r = new <Integer>ArrayList();
		r.add(25);
		r.add(19);
		r.add(29);
		r.add(85);
		r.add(97);
		r.add(28);
		
		int v = r.size();
		System.out.println(v);
		
		ListIterator l = r.listIterator();
		System.out.println("forword listing");
		while(l.hasNext())
		{
			System.out.println(l.next());
			//System.out.println(l.nextIndex());
		}
		
		System.out.println("backword listing");
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		r.clear();
		System.out.println(r);
		
	}

	}


