package DataTypes;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		year=sc.nextInt();
		if((year%4==0) && (year%100!=0) || year%400==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}

	}

}
