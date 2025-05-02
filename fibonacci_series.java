package dailyproblems;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of fibonacci you want :");
		int n = sc.nextInt();
		fibo(n);
	}

	public static void fibo(int num) {
		int f = 0;
		int s = 1;
		int res = 0;
		System.out.print(f);
		System.out.print(" "+s);
		for (int i = 2; i < num; i++) {
			res = f + s;
			System.out.print(" "+res);
			f = s;
			s = res;

		}

	}
}
