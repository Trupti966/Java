package DataTypes;

import java.util.Scanner;

public class Sum_of_N_Natural_Number_Without_Using_Loop {

	public static void main(String[] args) {
		int num,sum;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the N natural number ");
		num=obj.nextInt();
		sum=num*(num+1)/2;
		System.out.println(sum);
	}

}
