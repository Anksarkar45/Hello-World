//Printing multiplication table of given input number
package LogicalArun;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args)
	{
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Input your number:  ");
		int n=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n +"x"+i+"="+(n*i));
		}
		scan.close();
		
	}

}

/*
 Input your number:  
3
3x1=3
3x2=6
3x3=9
3x4=12
3x5=15
3x6=18
3x7=21
3x8=24
3x9=27
3x10=30
 
 */