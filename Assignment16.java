package MKT;


public class Assignment16 {
	static void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	static void add(double a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b,float c)
	{
		System.out.println(a+b+c);
	}
	
	void add(double a, int b, float c)
	{
		System.out.println(a+b+c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment16 a = new Assignment16();
		add(10,20.6);
		a.add(10, 30.8, 59);
		add(30.76,21);
		a.add(27.9,57,21);

	}

}
