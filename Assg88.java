package MKT;

public class Assg88 {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		StringBuffer s1 = new StringBuffer(40);
		StringBuffer s2 = new StringBuffer("Vinod");
		
		StringBuilder b = new StringBuilder();
		StringBuilder b1 = new StringBuilder(30);
		StringBuilder b2 = new StringBuilder("Vijayakumar Pattar");
		
		System.out.println("default stringbuffer "+ s);
		System.out.println("capacity of buffer "+ s1);
		System.out.println("with stringbuffer "+ s2);
		
		System.out.println("default builder "+ b);
		System.out.println("builder capacity "+ b1);
		System.out.println("with string builder "+ b2);
	}

}
