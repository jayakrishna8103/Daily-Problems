package dailyproblems;

import java.util.Scanner;

public class Largest_Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Digits to find largest:");
	int digits=sc.nextInt();
	System.out.print("Largest digit :"+findlargest(digits));
}
public static int findlargest(int n) {
	int largest=0;
	int num=n;
	while(num>0) {
		int digit=num%10;
		if(digit>largest)
			largest=digit;
		num/=10;
	}
	return largest;
}
}
