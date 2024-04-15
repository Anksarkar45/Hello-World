//Check whether given year is a leap year
/*
Defination_Leap year: Leap year: 366 days , normal year: 365 days

Cond1:If the year is evenly divisible by 4, and, NOT-EVENLY divisible by 100,then we call it as leap year

Cond2:If the year is evenly divisible by 4 and evenly divisible by 100, then we check the year is further evenly
divisible by 400, then we call it as leap year

*/
package LogicalArun;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Input year: ");
	int year=scan.nextInt();
	
	boolean isLeapYear=false;
	if(year%4==0)
	{
		if(year%100==0)
		{
			//when second condition true --enter third condition
			if(year%400==0)
			{
				isLeapYear=true;
			}else
			{
				isLeapYear=false;
			}
			
		}else
		{
			isLeapYear=true;
		}
	}else
	{
	isLeapYear=false;	
	}
	
	if(isLeapYear==true)
	{
		System.out.println("given year"+year+"is a leap year");
	}
	else
	{
		System.out.println("given year"+year+"is not leap year");
	}
	scan.close();

	
	
	}

}


//goal:trip to malvan- july31
//start income by getting job after clearing interview ,once preparing well
//meet basic needs--- self depend-- roti kapda makan education

/*
 Input year: 
2000
given year2000is a leap year

Input year: 
2001
given year2001is not leap year


 */
