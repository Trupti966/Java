package DataTypes;

import java.util.Scanner;

public class Reverse_the_Number {

	public static void main(String[] args) {
/*		int num,digit;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(;num!=0;) {
			digit=num%10;
			System.out.print(digit);
			num=num/10;
		}
*/
		
//		OR 
		
		int num,digit,sum = 0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(;num!=0;) {
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		System.out.print(sum);
	}

}
