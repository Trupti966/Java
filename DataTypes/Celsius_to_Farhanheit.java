package DataTypes;

import java.util.Scanner;

public class Celsius_to_Farhanheit {

	public static void main(String[] args) {
		int c;
		double f;
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		f=(1.8 *c) + 32;
		System.out.printf("%.2f",f);
	}

}
