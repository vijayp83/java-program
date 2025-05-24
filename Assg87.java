package MKT;

public class Assg87 {
	
	public static void main(String[] args) {
		
		StringBuilder b = new StringBuilder("Vishwanath");
		b.append(" Pattar");
		b.insert(11, "Mahalingappa ");
		b.delete(10, 23);
		String b1 = b.substring(11, 17);
		System.out.println(b1);
		
		b.replace(10, 16, " Mahalingappa");
		System.out.println(b);
		
		int s = b.capacity();
		System.out.println(s);
		b.reverse();
		System.out.println(b);
	}

}
