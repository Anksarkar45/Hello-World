package JavaPracticalNaveen;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,55,23,12,101};
		
		int ar[]=new int[4];
		
		System.out.println(a.length);//7
		System.out.println(Arrays.toString(a));//[1, 3, 4, 55, 23, 12, 101]
		
		//declarind types of arrays(double, char, vowel using array literals)
		double d[]= {1.1,2.3,4.5,5.6};
		char vowels[]= {'a','e','i','o','u'};
		//String browsers[]= {"chrome","firefox","IE","Edge","Safari"};
		
		
		//-----------------------We can include if statement and switch case statement ---- inside for loop---------
		
		String browsers[]= {"chrome","firefox","IE","Edge","Safari"};
		for(int k=0;k<browsers.length;k++)
		{
			/*
			System.out.println(browsers[k]);
			

			
			//if(browsers.equals("IE")) --- condition is not checked
			if(browsers[k].equals("IE"))//condition gets checked
			{
				System.out.println("This browser is deprecated");
			}
			*/
		
			switch(browsers[k])
			//switch(browsers[k].equals("Edge")) -- error
			{
			case "chrome":
				System.out.println("open google chrome");
				break;
				
			case "Edge":
				System.out.println("Open microsoft edge");
			default:
				
				break;
			}
			
		}
		
		
		//------------- declaring array in non-literal way
		
		int ar1[]=new int[4];
		ar1[0]=100;
		//ar[4]=200;
		//System.out.println(ar[4]);//AIOB exception
		
	}

}

/*
output
---------
7
[1, 3, 4, 55, 23, 12, 101]
open google chrome
Open microsoft edge

*/