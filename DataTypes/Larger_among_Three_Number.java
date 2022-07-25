package DataTypes;

import java.util.Scanner;

public class Larger_among_Three_Number {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three numbers ");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the largest among three.");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largest among three.");
		}
		else {
			System.out.println(c+" is the largest among three.");
		}
	}
}
