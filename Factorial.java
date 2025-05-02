package dailyproblems;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	fact(n);	
}
public static void fact(int num) {
	long res=1;
	for(int i=1;i<=num;i++) {
		res*=i;
	}
	System.out.print("factorial of "+num+" is "+res);
}
}
