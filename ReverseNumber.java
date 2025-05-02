package dailyproblems;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to reverse :");
	int n=sc.nextInt();
	System.out.print(reverse(n));
}
public static int reverse(int n) {
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
//	for(;n!=0;n/=10) {
//		int rem=n%10;
//		rev=rev*10+rem;
//	}
	return rev;
}
}
