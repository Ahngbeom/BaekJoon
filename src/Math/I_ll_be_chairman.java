package Math;

import java.util.Scanner;

public class I_ll_be_chairman {

	public int sum(int num, int iter) {
		if (num == 1)
			return 1;
		return num + sum(num - 1, iter);
	}
	
	public static void main(String[] args) {
		I_ll_be_chairman cm = new I_ll_be_chairman();
		Scanner sc = new Scanner(System.in);
//		int	test_case = sc.nextInt();
		
//		while (test_case-- > 0) {
			int	k = sc.nextInt();
			int n = sc.nextInt();
			int result = 0;
			while (k-- > 0)
			{
				while (n > 0)
				{
					result += cm.sum(n--, k);
					System.out.println(result);
				}
			}
			
//		}
			System.out.println(result);
	}

}
