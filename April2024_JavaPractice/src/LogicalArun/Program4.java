//Intaking two numbers using scanner and printing their sum
 package LogicalArun;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter first number: ");
   int a=scan.nextInt();
   
   System.out.println("Enter second number: ");
   int b=scan.nextInt();
   
   System.out.println("The sum of two given number is : "+(a+b));
   scan.close();
	}

}

/*
Enter first number: 
25
Enter second number: 
55
The sum of two given number is : 80
*/