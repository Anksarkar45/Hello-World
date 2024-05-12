package JavaPracticalNaveen;

public class ConditionalStatements {

	public static void main(String[] args) {
		
    int a=5;
    //int b=5;
    int b=3;
    
    System.out.println(a==b); //true
    
    //--------------------
    
    if(a==b)
    {
    	System.out.println("hi");
    }
    else
    {
    	System.out.println("hello");
    }
	//---------------------------------
    int c=1;
    if(c>a)
    {
    System.out.println("bye");
	}
    
    //------------------Example for dead code
    
    if(true)
    {
    	System.out.println("hi selenium");
    	}
    else
    {
    	System.out.println("bye selenium");
    }
    
    //---------------------
    boolean flag=true;
    if(flag)
    {
    	System.out.println("hi testing");
    }
    else
    {
    	System.out.println("bye testing");
    }
    //--------------
    
    boolean test=true;
    if(!test)
    {
    	System.out.println("testing is done");
    }
    else
    {
    	System.out.println("testing is pending");
    }
    
    //nested if
    int number=85;
    
    if(number<=100)
    {
    	System.out.println("Calculating your grade");
    	if(number>=90)
    	{
    		System.out.println("Grade A");
    		if(number==100)
    		{
    			System.out.println("you got 100 scholarship");
    		}
    		else
    		{
    			System.out.println("You are not eligible for 100% scholarship");
    		}
    	}
    	else
    	{
    		if(number>=80)
    		{
    			System.out.println("Grade B");
    		}
    	}
    }
    else
    {
    	System.out.println("Please pass the right marks");
    }
    //if conditions are fail - does not enter loop --- direct exit -- all conditions are not checked in nested-if
    
    //---------------------------------------------------
    //---- if if if - else or if-else if ladder booth same
    
	String browser="ie";
	if(browser.equals("chrome"))
	{												
		System.out.println("launch chrome");
	}
	
	if(browser.equals("firefox"))
	{
		System.out.println("launch firefox");
  	}
	if(browser.equals("safari"))
	{
		System.out.println("launch safari");
		}
	
	if(browser.equals("ie"))
	{
		System.out.println("launch i.e");
		}
	else
	{
		System.out.println("Please pass the right browser...... ");
	}
	
	//if-else if
	
	String browser1 ="safari";
	if(browser.equals("chrome"))
	{
		System.out.println("Launch Chrome");
	}
	else if(browser.equals("firefox"))
	{
		System.out.println("Launch Firefox");
	}
	else if(browser.equals("safari"))
	{
		System.out.println("Launch Safari");
	}
	else if(browser.equals("ie"))
	{
		System.out.println("Launch ie");
	}
	else
	{
		System.out.println("please pass right browser...");
	}
	}
    

}