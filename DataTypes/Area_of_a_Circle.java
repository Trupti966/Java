
/* Write a program to find the area of the circle.
		Consider pi = 3.142
*/
package DataTypes;

import java.util.*;

public class Area_of_a_Circle {

	public static void main(String[] args) {
		int radius;
		float pi = 3.142f, area;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius ");
		radius=obj.nextInt();
		area=pi*(radius*radius);
		System.out.printf("Area of the circle is "+"%.4f",area);
	}

}
