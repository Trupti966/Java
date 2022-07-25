package DataTypes;

import java.util.Scanner;

public class Factors_of_a_Number {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
