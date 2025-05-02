package dailyproblems;

import java.util.Scanner;

public class EvenandOdd_Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits :");
		int digits=sc.nextInt();
		findcount(digits);	
}
	public static void findcount(int n) {
		int even=0;
		int odd=0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==0) {
				even++;
			}
			else
				odd++;
			n/=10;
		}
		System.out.println("Even digits:"+even);
		System.out.println("Odd digits:"+odd);

	}
}