//Perimeter of a circle
package LogicalArun;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius: ");

		int radius=scan.nextInt();
		System.out.println("Perimeter of circle is "+(2*Math.PI*radius));
		scan.close();

	}

}

/*
 
 Enter the radius: 
5
Perimeter of circle is 31.41592653589793


 */

