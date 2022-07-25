package DataTypes;

import java.util.*;

public class Area_of_a_Square {

	public static void main(String[] args) {
		int side, area;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the side of the square ");
		side=obj.nextInt();
		area=side*side;
		System.out.printf("Area of the Square "+area);
	}

}
