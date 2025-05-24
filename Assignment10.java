package MKT;

public class Assignment10 {
	
	static void vote(int a)
	{
		if(a>=18)
		{
			System.out.println("He/She can vote");
		}
		else
		{
			System.out.println("He/She cannot vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vote(18);
		vote(20);
		vote(17);
		

	}

}
