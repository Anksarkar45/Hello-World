//Java program to take width and height of a rectangle and find its perimeter
package LogicalArun;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			System.out.println("Enter height of rectangle");
		    double height=scn.nextDouble();
		    System.out.println("Enter width of rectangle");
		    double width=scn.nextDouble();
		    scn.close();
		    //Logic for finding perimeter of rectangle
            System.out.println("Perimeter of rectangle is : "+2*(height+width));
	}

}
/*
output
------
Enter height of rectangle
5
Enter width of rectangle
10
Perimeter of rectangle is : 30.0


*/