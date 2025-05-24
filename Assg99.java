package MKT;

import java.util.HashMap;
import java.util.Map;

public class Assg99 {
	
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
		System.out.println(m);
		System.out.println(m1);
		m1.remove(996633);
		System.out.println(m1);
		m1.replace(12345, "Pattar");
		System.out.println(m1);
		System.out.println(m1.size());
		m1.clear();
		System.out.println(m1);
		
	}

}
