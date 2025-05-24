package MKT;

public class Assg86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("Vijay");
		s.append("akumar ");
		s.insert(12, "Pattar");
		System.out.println(s);
		s.delete(5, 11);
		System.out.println(s);
		String s1 = s.substring(0, 5);
		System.out.println(s1);
	
		int s2 = s.capacity();
		System.out.println(s2);	
		s.replace(5, 10, "akumar");
		System.out.println(s);
		s.delete(10, 12);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}

}
