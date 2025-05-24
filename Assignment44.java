package MKT;

class Cricket
{
	Cricket()
	{
		this(4);
		System.out.println("Virat");
	}
	
	Cricket(int a)
	{
		this(2,6.8);
		System.out.println("Rajat");
	}
	
	Cricket(int a, double b)
	{
		System.out.println("Josh");
	}
}
public class Assignment44 extends Cricket{
	
	
	public static void main(String[] args) {
		
		new Assignment44();
	}

}
