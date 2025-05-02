package dailyproblems;

import java.util.Scanner;

public class SumofDigits_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits :");
		int digits = sc.nextInt();
		sum(digits);
	}

	public static void sum(int n) {
		for (int i = 2; i <= n; i++) {
			int t = i;
			int s = 0;
			while (t > 0) 
			{
				int r = t % 10;
				s += r;
				t /= 10;
			}
			if(isprime(s))
				System.out.print(i+" ");
			
		}
	}
	public static boolean isprime(int s) {
		for (int j = 2; j <=s / 2; j++) {
			if (s % j == 0)
				return false;
		}
		return true;

	}
}
