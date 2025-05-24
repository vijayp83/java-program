package MKT;

public class Assigment12 {
	
	void add()
	{
		System.out.println("default value");
	}
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void add(int a, String b)
	{
		System.out.println("Int + String");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assigment12 n = new Assigment12();
		n.add();
		n.add(12,"Vijay");
		n.sub(12, 22);

	}

}
