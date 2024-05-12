package JavaPracticalNaveen;

import java.util.Arrays;

public class LoopsWithforEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for each loop
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int e:a)
		{
			System.out.println(e); //10 20 30 40
		}
		
		System.out.println(a[2]);//30
			
		String emp[]=new String[5];
		emp[0]="pooja";
		emp[1]="ravi";
		emp[2]="robin";
		emp[3]="vikash";
		emp[4]="Akhil";
		
		for(String e:emp)
		{
			System.out.println(e);
			if(e.equals("vikash"))
			{
				System.out.println("he is a developer");
			    break;
			}
		}
		
		//object array
		Object employee[]=new Object[5];
		employee[0]="Tom";
		employee[1]=30;
		employee[2]=23.33;
		employee[3]='m';
		employee[4]="true";

		for(Object e:employee)
		{
			System.out.println(e);// tom, 30 ,23.33, m ,true
		}
		
		System.out.println("--------------");
		
		//normal integer array declaration and printing array in reverse order, using normal for loop
		int ar[]=new int[4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		 for(int i=ar.length-1;i>=0;i--)
		 {
			 System.out.println(ar[i]);//40 30 20 10
		 }		
		 System.out.println("-----------");
		 //declaring array of 4 memory location, but storing only single value in it
		 
		 int pr[]=new int[4];
		 System.out.println(pr[0]);//stores default value 0
		
		 //storing value 10 inside pr[0]
		 pr[0]=1000;
		 System.out.println(pr[0]);
		 
		 System.out.println("--------------");
		 //declaring and initialiaing array inside singke step
		 int test[]= {10,20,40,55,66,77,88,909};
		 System.out.println(test.length);//8
		 System.out.println(test[0]);//10
		 System.out.println(test[1]);//20
         //System.out.println(test[8]);//Array index out of bound exception
         //System.out.println(test[9]);//Array index out of bound exception
	     
		 //---- updating array element at index 0
		 test[0]=40;
	     System.out.println(test[0]);//40
	     
	     //--- adding element at index 8 (which is exceeding the length)
	   //  test[8]=600;-- array index out of bound exceptoon
	     //System.out.println(test[8]);
	     
	     test[3]=99;
	     System.out.println(test[3]);//99
	     
	     //printing array elements directly--- without using loop--- by using Arrays.toString method
	     System.out.println(Arrays.toString(test));//[40, 20, 40, 99, 66, 77, 88, 909]

	}

}
