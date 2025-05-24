package MKT;

abstract class car
{
	abstract void drive();
	
}
public class Assignment49 extends car {

	void drive() {
		System.out.println("moving in high speed");
		
	}
	
	public static void main(String[] args) {
		
		Assignment49 a = new Assignment49();
		a.drive();
	}
	

}
