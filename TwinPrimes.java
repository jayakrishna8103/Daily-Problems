package dailyproblems;

import java.util.Scanner;

public class TwinPrimes {
	
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the start number");
		int a=ob.nextInt();
		System.out.println("enter the end number");
		int b= ob.nextInt();
		for(int i=a;i<=b;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
				
			}
			if(c==2) {
				
				int d=i+2;
				int c1=0;
				for(int k=1;k<=d;k++) {
					if(d%k==0) {
						c1++;
					}
					
				}
				if(c1==2) {
					System.out.println("("+i+","+ d+")");
				}
			}
			
		}
	}

}