package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
	
	  //constructor
	public  ChromeDriver()
	{
		System.out.println("Launch chrome browser....");
	}
	    @Override //from webdriver interface
		public void get(String url)
	    {
	    	System.out.println("Entering url :" +url);
	    }
		
		@Override //from webdriver interface
		public String getTitle()
		{
			return "amazon";
		}
		
		@Override //from webdriver interface
		public void click(String element)
		{
			System.out.println("click on "+element);
		}
		
		@Override //from WebDriver interface
		public void sendKeys(String element,String value)
		{
			System.out.println("entering"+value+"into"+element);
		}
		
		@Override //from webdriver interface
		public void close()
		{
			System.out.println("close browser");
		}
		
		//overriding method from parent interface
		@Override
		public void findElement(String element)
		{
		System.out.println("find element by using "+element);	
		}
}
