package dailyproblems;

import java.util.Scanner;

public class Conditional_Checks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	int temp=n;
	int os=0;
	int es=0;
	while(temp>0) {
		int r=temp%10;
		if(r%2==0)
			es+=r;
		else
			os+=r;
		temp/=10;
	}
	if(es>os)
		isPrime(n);
	else if(os>es)
		isArmstrong(n);
	else
		isPalindrome(n);
}

	public static void isPrime(int num) {
		int c=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				c++;
		}
		if(c==0) {
			System.out.println("Prime number");
		}
		else 
			System.out.println("Not a Prime number");

	}

	public static void isArmstrong(int num) {
		int t=num;
		int c=0;
		int res=0;
		int temp=num;
		while(temp>0) {
			temp=temp/10;
			c++;
		}
		while(num>0) {
			int rem=num%10;
			res+=Math.pow(rem,c);
			num/=10;
		}
		if(t==res)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");


	}

	public static void isPalindrome(int num) {
		int res=0;
		int n=num;
		while(num>0) {
			int r=num%10;
			res=res*10+r;
			num/=10;
		}
		if(res==n) {
			System.out.print("Palindrome ");
		}
		else
			System.out.print("Not a Palindrome ");

			
	}
}
