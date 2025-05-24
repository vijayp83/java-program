package MKT;

public class Assigment9 {
	
	static void add(int a,int b, int c, int d)
	{
		if(a>c && b>d)
		{
			System.out.println("Hi");
		}
		
		if(a>c || b>d)
		{
			System.out.println("Hello");
		}
		
		if(!(a>b && b>c))
		{
			System.out.println("Hello World");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(10,20,30,40);
		add(40,40,20,50);
		add(60,50,30,10);
		
		

	}

}
