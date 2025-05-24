package MKT;

import java.util.ArrayList;
import java.util.List;

public class Assg92 {
	
	public static void main(String[] args) {
		
	List	l = new ArrayList();
	l.add("vijay");
	l.add("pattar");
	l.add(32);
	l.add("hubli");
	l.add(853554346);
	l.add('M');
	
	
	l.add(3, "virat");
	l.remove(1);
	System.out.println(l);
	
	List l2 = new ArrayList();
	l2.add("Vk");
	l2.add("pat");
	l2.add(232);
	l2.add(0, 465);
	l2.addAll(l);
	
	System.out.println(l2);
	
	l2.addAll(3, l);
	System.out.println(l2);
	
	boolean b = l2.containsAll(l);
	System.out.println(b);
	
	}

}
