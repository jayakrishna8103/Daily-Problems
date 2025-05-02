package dailyproblems;

import java.util.Scanner;

public class primedigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits:");
		int num = sc.nextInt();
		primes(num);
	}

	public static void primes(int num) {
		int temp = num;
		int rem = 0;
		while (temp > 0) {
			rem = temp % 10;
			int c = 0;
			if (rem > 1) {
				for (int i = 1; i <= rem; i++) {
					if (rem % i == 0) {
						c++;
					}
				}
				if (c == 2)
					System.out.println(rem + "is prime");
				temp /= 10;
			}
		}

	}

}
