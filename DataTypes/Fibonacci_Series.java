package DataTypes;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int num,a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=num-2;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
