package dailyproblems;

import java.util.Scanner;

public class Palindrome_inRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range  :");
	int n = sc.nextInt();
	palindrome(n);
}
public static void palindrome(int n) {
	for(int i=1;i<=n;i++) {
		int res=0;

		int num=i;
		while(num>0) {
			int r=num%10;
			res=res*10+r;
			num/=10;
		}
		if(res==i) {
			System.out.print(res+" ");
		}
	}
}
}
