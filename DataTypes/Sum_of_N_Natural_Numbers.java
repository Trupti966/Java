package DataTypes;

import java.util.Scanner;

public class Sum_of_N_Natural_Numbers {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the N natural number ");
		num=obj.nextInt();
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
