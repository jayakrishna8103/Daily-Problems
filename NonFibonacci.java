package dailyproblems;

import java.util.Scanner;

public class NonFibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		for (int i = 1; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;

			while (c > i && i <= n) {
				System.out.println(i + " ");
				i++;
			}

		}

	}
}