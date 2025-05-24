package MKT;

import java.util.HashMap;
import java.util.Map;

public class Assg101 {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap();
		m.put(12345, "Vijay");
		m.put(987622, "Vinod");
		m.put(45678, "Vishwa");
		
		Map<Integer,String> m1 = new HashMap();
		m1.put(996633, "Riya");
		m1.put(221133, "Kiran");
		m1.put(112233, "Anil");
		m1.putAll(m);
		m1.containsKey(m);
		System.out.println(m1);
		System.out.println(m.get(12345));
		System.out.println(m1.containsValue("Kiran"));
		
		m1.put(112233, null);
		m1.putIfAbsent(112233, "Anil");
		System.out.println(m1);
		
		boolean w = m1.equals(m);
		System.out.println(w);
		
	
	}

}
