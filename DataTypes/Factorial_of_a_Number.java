package DataTypes;

import java.util.Scanner;

public class Factorial_of_a_Number {

	public static void main(String[] args) {
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
/*
num=4 fact=0

i=1 i<=4
fact=1*1=1

 i=2 i<=4
 fact=1*2=2
 i=3 i<=4
 fact=2*3=6
 i=4 i<=4
 fact=6*4=24
 
 4----> 4*3*2*1

*/

