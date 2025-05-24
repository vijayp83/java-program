package MKT;

abstract class Duster
{
	abstract void drive();
	
	void music()
	{
		System.out.println("playing music ");
	}
	
}

public class Assignment50 extends Duster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment50 a = new Assignment50();
		
		a.drive();
		a.music();

	}

	void drive() {
		System.out.println("driving car");
		
	}

}
