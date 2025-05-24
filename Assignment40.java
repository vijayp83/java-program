package MKT;

class Carnivoras{
	
	static void lion() {
		
		System.out.println("it is a animal");
	}
}

class Tree extends Carnivoras{
	
	static void tree1(){
		
		System.out.println("the animal has eaten");
		
	}
}

public class Assignment40 extends Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion();
		tree1();
		

	}

}
