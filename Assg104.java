package MKT;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assg104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap();
		m.put(12345, "Vijay");
		m.put(987622, "Vinod");
		m.put(45678, "Vishwa");
		
		Map<Integer,String> m1 = new HashMap();
		m1.put(996633, "Riya");
		m1.put(221133, "Kiran");
		m1.put(112233, "Anil");
		
		m1.putAll(m);
		
		for(Entry<Integer, String> s:m1.entrySet())
		{
			System.out.println(s);
		}

	}

}
