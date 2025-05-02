package dailyproblems;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		boolean ans=perfectnumber(n);
		if(ans)
			System.out.println(n+" is a Sunny Number");
		else 
			System.out.println("Not a Sunny Number");
}
	public static boolean perfectnumber(int n) {
		for(int i=1;i<=n;i++) {
			if(i*i==n+1)
				return true;
		}
		return false;
	}
}
