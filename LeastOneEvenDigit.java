package dailyproblems;

import java.util.Scanner;

public class LeastOneEvenDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start :");
		int s = sc.nextInt();
		System.out.println("Enter end :");
		int e = sc.nextInt();
		findeven(s, e);
	}

	public static void findeven(int num, int e) {
		for (int i = num; i < e; i++) {
			int n=i;
			while (n > 0) {
				int r = n % 10;
				if (r % 2 == 0)
					System.out.println(i);
				n /= 10;
			}	
		}
		
	}
}
