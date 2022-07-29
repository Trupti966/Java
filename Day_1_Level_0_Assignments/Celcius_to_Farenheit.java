package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Celcius_to_Farenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		float f =(m*1.8f)+32;
		System.out.printf("%.1f",f);
	}
}
