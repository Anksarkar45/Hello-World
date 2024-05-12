package JavaPracticalNaveen;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//limitations of array
		//1.fixed size
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[0]);//10
		System.out.println(a[3]);//40
		
		//System.out.println(a[4]);//array index out of bound exception
		//System.out.println(a[-1]);//array index out of bound exception
	
	    int len=a.length;
	    System.out.println(len);//4
	    
	    int hi=len-1;
	    System.out.println(hi);//3
	    
	    int li=0;
	    System.out.println(li);//0
	    
	    System.out.println("----------------------");
	    //to print all values from the array :using for loop
	    
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println(a[i]);//10 20 30 40
	    }
	    
	    //to print all values from array: without using for loop
	    System.out.println(a);//[I@6d06d69c -- error we cannot print array directly , using S.O.P statement
	    
	    System.out.println(Arrays.toString(a));//[10,20,30,40]

	    //double array
	    double d[]=new double[2];
	    d[0]=12.33;
	    d[1]=34.33;
	    System.out.println(d[0]+d[1]);//46.66
	    
	    //String Array
	    String emp[]=new String[3];
	    emp[0]="Pooja";
	    emp[1]="Ravi";
	    emp[2]="Robin";
	    System.out.println("Total emp:"+emp.length);//Total emp:3
	    
	    for(int k=0;k<emp.length;k++)
	    {
	    	System.out.println(emp[k]);
	    	if(emp[k].equals("Ravin"))
	    	{
	    		System.out.println("Ravin Salary is : "+1000);
	    	    break;
	    	}   
	    }
	    
	}

}
