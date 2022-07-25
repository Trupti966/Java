package DataTypes;

import java.util.Scanner;

public class Sum_of_Digit_Intiger {

	public static void main(String[] args) {
		int num,sum=0,digit;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(;num!=0;){
			
		 //finds the last digit of the given number
			digit=num%10;
			
		//adds last digit to the variable sum
			sum=sum+digit;
			
		//removes the last digit from the number 
			num=num/10;
		}
		System.out.println(sum);
	}

}
