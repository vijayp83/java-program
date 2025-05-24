package MKT;

interface bike
{
	void drive();
	void music();
	
}

class Duster1 implements bike
{
	public void drive() {
	System.out.println("driving");
		
	}

	public void music() {
		System.out.println("playing music");
		}
	
}

public class Assignment51 {
	
	public static void main(String[] args) {
		Duster1 obj = new Duster1();
		obj.drive();
		obj.music();
		
		
	}

}
