package w3resource;

public class Operations1 {
	
	
//	 public static void main(String[] args) {
//	  System.out.println(-5 + 8 * 6);
//	  System.out.println((55+9) % 9);
//	  System.out.println(20 + -3*5 / 8);
//	  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//	 }
	//Another simpler way to do this program is stated above. 
	//I m trying a bit odd and difficult method just for practice.
	
	

	public int add(int a, int b)
	{
		int s;
		s = a+b;
		return s;
	}
	public int mul(int c, int d)
	{
		int m;
		m = c*d;
		return m;
	}
	public int mod(int e, int f)
	{
		int x;
		x = e%f;
		return x;
	}
	public int sub(int g, int h)
	{
		int y;
		y = g-h;
		return y;
	}
	public int div(int i, int j)
	{
	int d;
	d = i/j;
	return d;
	}
	public static void main(String[] args)
	{
		Operations1 solve = new Operations1();
		solve.mul(8, 6);
		solve.add(-5, solve.mul(8, 6));
		System.out.println("Answer to first question = " +solve.add(-5, solve.mul(8, 6)));
		
		solve.add(55, 9);
		solve.mod(solve.add(55, 9), 9);
		System.out.println("Answe to second question = " +solve.mod(solve.add(55, 9), 9));
		
		solve.mul(-3, 5);
		solve.div(solve.mul(-3, 5), 8);
		solve.add(20, solve.div(solve.mul(-3, 5), 8));
		System.out.println("Answer to third question = " +solve.add(20, solve.div(solve.mul(-3, 5), 8)));
		
		solve.div(15, 5);
		solve.mul(solve.div(15, 5), 2);
		solve.add(solve.mul(solve.div(15, 5), 2), 5);
		solve.mod(-8, 3);
		solve.sub(solve.add(solve.mul(solve.div(15, 5), 2), 5), solve.mod(-8, 3));
		System.out.println("Answer to forth question = " +solve.sub(solve.add(solve.mul(solve.div(15, 5), 2), 5), solve.mod(-8, 3)));
		
	}
}
