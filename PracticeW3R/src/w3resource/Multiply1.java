package w3resource;

public class Multiply1 {
	
//	static int a = 125;
//	static int b = 5;
//	int c =a*b;
//	public static void main(String[] args)
//	{
//		System.out.println(a*b);
//	}
	//Just another way to code this program.
	

	public int mul(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		
		Multiply1 solve = new Multiply1();
		solve.mul(125, 5);
		System.out.println("Answer = "+ solve.mul(125, 5));
		
	}

}
