package DataTypes;

import java.util.Scanner;

public class Circle_Perimeter {

	public static void main(String[] args) {
		int radius;
		float pi=3.142f, perimeter;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius of the circle ");
		radius=obj.nextInt();
		perimeter=2*pi*radius;
		System.out.printf("Perimeter of the circle "+"%.4f",perimeter);

	}

}
