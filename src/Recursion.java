import java.util.Scanner;

public class Recursion {

	public int factorial(int num)
	{
		int n;

		n = num;
		if (n <= 1)
			return (1);
		n = n * factorial(--num);
		return (n);
	}
	
	public static void main(String[] args) {
		Recursion rc = new Recursion();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(rc.factorial(sc.nextInt()));
	}

}
