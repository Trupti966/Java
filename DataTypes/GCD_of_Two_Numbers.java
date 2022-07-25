package DataTypes;

import java.util.Scanner;

public class GCD_of_Two_Numbers {

	public static void main(String[] args) {
		int x,y,gcd=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		x=obj.nextInt();
		y=obj.nextInt();
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD of "+x+" "+y+" "+ "is "+gcd);
	}

}
