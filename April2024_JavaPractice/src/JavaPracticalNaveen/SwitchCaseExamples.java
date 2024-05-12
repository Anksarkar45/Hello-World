package JavaPracticalNaveen;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// byte,short,int,char,String----valid 
		//long,float,double, boolean----invalid
		
		
		/*---------------
		 long var=121324234535L;
         switch(var) //Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		{
        case 121324234535L:
        }
		------------------*/
		
		int num=10;
		switch(num)
		{
		case 10:
			System.out.println("10");
		    break;
		    
		    default:
		    break;
		} 
		    //------------------------
		    
		    String stName="Mahesh";
		    int marks=0;
		    
		    switch(stName)
		    {
		    case "TOM":
		    System.out.println("TOM Passed");
		    marks=100-20;
		    break;
		    
		    case "Peter":
		    	System.out.println("peter passed");
		    	marks=100;
		    	break;
		    	
		    case "naveen":
		    	System.out.println("naveen passed");
		    	marks= -1;
		    	break;
		    default :
		    	System.out.println("Student is not found: "+stName);
		    	marks=-1;
		    	break;
		    }
		    	System.out.println(marks);
		    	if(marks>=0)
		    	{
		    		System.out.println("Print marks sheet");
		    	}
		    	else
		    	{
		    		System.out.println("No need to print");
		    	}
		    
		    
		    		
		    }
		    
		}
		
	
	


