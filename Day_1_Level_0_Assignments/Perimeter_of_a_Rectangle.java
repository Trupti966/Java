package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int width = scan.nextInt();
		int area = 2*(length+width);
		System.out.println(area);
	}
}
