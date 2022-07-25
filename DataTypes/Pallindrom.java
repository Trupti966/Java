package DataTypes;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		int num,num2,digit,sum = 0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		num2=num;
		for(;num!=0;) {
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		if(num2==sum) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		
	}

}
