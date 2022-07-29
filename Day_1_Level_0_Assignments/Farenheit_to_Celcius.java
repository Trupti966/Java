package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Farenheit_to_Celcius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		float c =(m-32)/1.8f;
		System.out.printf("%.4f",c);
	}
}