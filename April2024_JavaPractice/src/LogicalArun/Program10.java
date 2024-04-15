//Area of circle
package LogicalArun;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius=scan.nextDouble();
		System.out.println("Area of circle is " +(Math.PI*radius*radius));

		scan.close();
	}

}
/*
 * 
Enter the radius of circle
20
Area of circle is 1256.6370614359173

 */