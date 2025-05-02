package dailyproblems;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=sc.nextInt();
	armstrong(n);
}
private static void armstrong(int n) {
	int t=n;
	int c=0;
	int res=0;
	int temp=n;
	while(temp>0) {
		temp=temp/10;
		c++;
	}
	while(n>0) {
		int rem=n%10;
		res+=Math.pow(rem,c);
		n/=10;
	}
	if(t==res)
		System.out.println("Armstrong Number");
	else
		System.out.println("Not an Armstrong Number");

}
}
