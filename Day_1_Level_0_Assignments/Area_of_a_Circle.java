package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Area_of_a_Circle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rad = scan.nextInt();
		float pi = 3.142f;
		float area = pi*rad*rad;
		System.out.printf("%.4f",area);
	}
}
