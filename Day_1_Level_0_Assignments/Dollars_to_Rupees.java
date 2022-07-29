package Day_1_Level_0_Assignments;

import java.util.Scanner;

public class Dollars_to_Rupees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dollar = scan.nextInt();
		float rupees = (dollar*61.06f);
		System.out.println(rupees);
	}
}
