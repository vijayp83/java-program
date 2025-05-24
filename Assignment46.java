package MKT;

class Mobile
{
	 void on()
	{
		System.out.println("turn on the mobile by pressing button");
	}
}

public class Assignment46 extends Mobile {
	
	 void on()
	{
		System.out.println("turn on by double tapping screen");
		super.on();
	}
	
	public static void main(String[] args) {
		
		Assignment46 s= new Assignment46();
		s.on();
		
		
	}
	

}
