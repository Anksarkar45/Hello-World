//Check whether given input number is even or odd
package LogicalArun;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Input your number: ");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("Given number " +a+"is an even number");
		}
		else
		{
			System.out.println("Given number " +a+"is odd number");
		}
		scan.close();
	}

}

/*
case1:
Input your number: 
5
Given number 5is odd number

 case2:
 Input your number: 
 50
 Given number 50is an even number

 */
