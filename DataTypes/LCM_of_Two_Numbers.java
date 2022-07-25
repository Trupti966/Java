package DataTypes;

import java.util.Scanner;

public class LCM_of_Two_Numbers {

	public static void main(String[] args) {
		int m,n,gcd=1,lcm;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		m=obj.nextInt();
		n=obj.nextInt();
		for(int i=1;i<=m && i<=n;i++) {
			if(m%i==0 && n%i==0) {
				gcd=i;
			}
		}
		lcm=(m*n)/gcd;
		System.out.println("LCM between two numbers is "+lcm);

	}

}
