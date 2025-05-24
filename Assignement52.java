package MKT;

class booler
{
	void cardriver()
	{
		System.out.println("skidding");
	}
}

class fz extends booler
{
	void riding()
	{
		System.out.println("wheeling");
	}
}

public class Assignement52 extends fz
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignement52 a = new Assignement52();
		a.cardriver();
		a.riding();
		

	}

}
