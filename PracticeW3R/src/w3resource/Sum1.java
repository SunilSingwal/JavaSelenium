package w3resource;

public class Sum1 {

	
	public int sum(int a, int b) 
	{
		int c;
		c=a+b;
		System.out.println("Sum = "+c);
		return c;
	}
	public static void main(String[] args) {
		Sum1 abc = new Sum1();
		abc.sum(74, 36);
		

	}

}
