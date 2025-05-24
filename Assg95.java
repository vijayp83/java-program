package MKT;

import java.util.HashSet;
import java.util.Set;

public class Assg95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		s.add("Vinod");
		s.add("Pattra");
		s.add('M');
		s.add(89);
		s.add(64.20);
		s.add(7872023);
		s.add("Vinod");
		s.add(null);
		s.add(null);
		s.remove("Vinod");
		
		System.out.println(s.size());
		
		System.out.println(s);
		s.clear();
		System.out.println(s);
		

	}

}
