package DataTypes;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int num,counter=0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
		}
		if(counter==2) {
			System.out.println("YES its a Prime number");
		}
		else {
			System.out.println("NO its not a 29Prime number");
		}
	}

}
