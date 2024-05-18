package JavaPracticalNaveen;

public class Concept {
	
	public boolean launchBrowser(String browserName)
	{
		System.out.println("browser name:"+browserName);
		
		boolean flag=true;
		
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "safari":
			System.out.println("Launch safari");
			break;
			
		case "firefox":
		    System.out.println("Launch firefox");
		    break;
		    
		case "ie":
			System.out.println("Launch ie");
		    break;
		    
		    default:
		    	System.out.println("please pass the right browser"+browserName);
		    	flag=false;
		    	break;
		}
		return flag;
	}

	public void testing()
	{
		System.out.println("testing method");
		return;
		//Note: void and return can be together , provided that return statement should not return anything- exceptional case
	}
	public static void main(String[] args) {
		Concept c=new Concept();
		//method calling
		//c.launchBrowser("chrome");//browser name : chrome ---- launch chrome
		
		//Validation
		boolean isLaunched=c.launchBrowser("chroma");
		if(isLaunched) 
		{
			System.out.println("Enter url");
		}
		else
		{
			System.out.println("Do not enter url");
		}

	}

}
