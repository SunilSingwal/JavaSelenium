package w3resource;

public class Division1 {

	public int div(int a, int b)
	{
		//int d; This can also be a way to solve this. Define a seperate integer d. 
		//d=a/b;  Assign the division formula.
		
		System.out.println("Answer = "+(a/b));
		return a/b;
	}
	public static void main(String[] args) {
       Division1 abc = new Division1();
       abc.div(50, 3);
       
	}

}
