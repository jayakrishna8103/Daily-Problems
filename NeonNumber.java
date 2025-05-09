package dailyproblems;

import java.util.Scanner;

public class NeonNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	if(isneon(n))
		System.out.println(n+" is a neon number");
	else
		System.out.println("not a neon number");
}
public static boolean isneon(int n) {
	int s=n*n;
	int result=0;
	while(s>0) {
		int r=s%10;
		result+=r;
		s/=10;
	}
	if(result==n)
		return true;
	return false;
}
}
