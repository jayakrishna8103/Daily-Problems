package dailyproblems;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=sc.nextInt();
    boolean a=fact(n);
	if(a)
		System.out.println(n+" is a Strong Number");
	else
		System.out.println("Not a Strong Number");
}
public static boolean fact(int n) {
	int num=n;
	int res=0;
	while(num>0) {
		long sum=1;
		int r=num%10;
		for(int i=1;i<=r;i++) {
			sum*=i;
		}
		res+=sum;
		num/=10;
	}
	return res==n;
}
}
