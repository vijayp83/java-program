package MKT;

class Star {
	Star(String v)
	{
		System.out.println("Star1");
	}
}

public class Assignment43 extends Star {
	
	Assignment43(String v)
	{
		super(v);
		System.out.println("Star2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Assignment43("vijay");

	}

}
