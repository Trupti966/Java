package DataTypes;

import java.util.Scanner;

public class Swap_two_numbers {

	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 = ");
		num1=sc.nextInt();
		System.out.print("Enter num2 = ");
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping the numbers are ........");
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);

	}

}
