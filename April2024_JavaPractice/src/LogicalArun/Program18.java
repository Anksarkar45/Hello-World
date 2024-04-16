package LogicalArun;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first=sc.nextInt();
		System.out.println("Enter second number");
        int second=sc.nextInt();
       int temp;
       
        
        temp=first;
        first=second;
        second=temp;
        
        System.out.println("After swapping first_number is:"+first);
        System.out.println("After swapping second_number is:"+second);
	}

}
/*
output
------
Enter first number: 
10
Enter second number
20
After swapping first_number is:20
After swapping second_number is:10
*/