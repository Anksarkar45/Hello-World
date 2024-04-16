//Java program to find the power of a number
package LogicalArun;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int initialnumber=number;
        System.out.println("Enter the power");
        int power=scanner.nextInt();
        for(int i=1;i<power;i++)
        {
        	number=number*initialnumber;
        }
        System.out.println("The "+initialnumber+"power"+power+"is:"+number);
	    scanner.close();
	}

}

/*
 Enter the number
5
Enter the power
3
The 5power3is:125

 */