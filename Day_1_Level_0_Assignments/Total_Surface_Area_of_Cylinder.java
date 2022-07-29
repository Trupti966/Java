package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Total_Surface_Area_of_Cylinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rad = scan.nextInt();
		int height = scan.nextInt();
		float pi = 3.142f;
		float area = 2*pi*rad*(rad+height);
		System.out.printf("%.4f",area);
	}
}
