//Java program which intakes width and height of a rectangle and thereby print its area
//Area=width*height
package LogicalArun;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the height of rectangle: ");
		double height=scan.nextDouble();
		
		System.out.println("Enter the width of rectangle:");
		double width=scan.nextDouble();
		
		scan.close();
		System.out.println("Area of rectangle is : "+(height*width));

	}

}
/*
output
----------
Enter the height of rectangle: 
5
Enter the width of rectangle:
6
Area of rectangle is : 30.0
*/