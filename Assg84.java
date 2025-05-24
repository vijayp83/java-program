package MKT;

public class Assg84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "VijayKumar Pawwar ";
		
		char[] c = s.toCharArray();
		
		String v = s.substring(3);
		System.out.println(v);
		
		String replace = s.replace('w', 't');
		System.out.println(replace);
		
		String replaceall = s.replaceAll("Payyar", "Pattar");
		System.out.println(replaceall);
		
		boolean q = s.matches(replaceall);
		if(q==true)
		{
			System.out.println("it matches");
		}
		else
		{
			System.out.println("it does not");
		}
		
		
		String r = s.repeat(4);
		System.out.println(r);
		

	}

}
