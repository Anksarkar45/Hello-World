//Finding quotient and remainder after division
package LogicalArun;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num=scanner.nextInt();
		
		System.out.println("Enter the divisor: ");
	    int divisor=scanner.nextInt();
     
	    //division operator to find quotient
	    System.out.println("Quotient is : "+(num/divisor));
	    
	    //modulus operator to find remainder
	    System.out.println("Remainder is: "+(num%divisor));
	    
	    scanner.close();
	    }

}
/*
 Enter the first number:
10
Enter the divisor: 
5
Quotient is : 2
Remainder is: 0
------------------------------

 Enter the first number:
10
Enter the divisor: 
6
Quotient is : 1
Remainder is: 4

 
 */