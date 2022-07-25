package DataTypes;

import java.util.Scanner;

public class Square_Perimeter {

	public static void main(String[] args) {
		int perimeter, side;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the side of the square ");
		side=obj.nextInt();
		perimeter=4*side;
		System.out.println("Perimeter of the square "+perimeter);
	}

}
