package JavaPracticalNaveen;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {
		
		
		int product[]=new int[50];
		
		/*
		//--------Limitations of array(Static array): 
		1.static array-- size is fixed- to overcome this problem, we need to use dynamic array(Array List)
		2. static array- stores similar type of data --- to over come this we use Object Array Concept
        3.Static array- use case: bookmyshow.com, flight booking website, ecommerce website>category section, country drop down list
       */
		
		Object emp[]=new Object[5];
		emp[0]="Tom";
		emp[1]=30;
		emp[2]=23.33;
		emp[3]='m';
		emp[4]=true;
		
		//printing object array without using loop
		System.out.println(Arrays.toString(emp)); //[Tom,30,23.33,m,true]

	//printing object array
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
		/*
		 * Tom
		 * 30
		 * 23.33
		 * m
		 * true
		 * */
	}

}
