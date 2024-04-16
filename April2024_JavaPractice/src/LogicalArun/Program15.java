//Intake 6 numbers as input from user and print their average
package LogicalArun;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNum=scan.nextInt();

		System.out.println("Enter second number: ");
		int secondNum=scan.nextInt();

		System.out.println("Enter third number: ");
		int thirdNum=scan.nextInt();

		System.out.println("Enter fourth number: ");
		int fourthNum=scan.nextInt();

		System.out.println("Enter fifth number: ");
		int fifthNum=scan.nextInt();

		System.out.println("Enter sixth number: ");
		int sixthNum=scan.nextInt();

		scan.close();
		
		System.out.println("The average of above inputted 6 numbers are:"+
		(firstNum+secondNum+thirdNum+fourthNum+fifthNum+sixthNum)/6);
		
	}

}

/*
output:
	
	Enter first number: 
		5
		Enter second number: 
		6
		Enter third number: 
		3
		Enter fourth number: 
		4
		Enter fifth number: 
		2
		Enter sixth number: 
		1
		The average of above inputted 6 numbers are:3

*/