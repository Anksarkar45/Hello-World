//Encapsulated-- no main() class
//corresponding user class---BrowserTest.java
package Oops_Encapsulation;

public class Browser {

	//public method
	public void launchBrowser()
	{
		System.out.println("launching browser");
	
		//Note: Here private methods are encapsulated inside public method - launchbrowser() and acessing from outside of the class ,hence following the principle of encapsulation
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAM();
        checkCPU();		
	    System.out.println("browser launched");
	}
	
	//private method1
	private void checkBrowserVersion()
	{
		System.out.println("Check browser version....");
	}
	
	//private method2
	private void checkOSCompatibility()
	{
		System.out.println("check OS compatibility");
	}
	
	//private method3
	private void checkRAM()
	{
		System.out.println("check RAM");
		
	}
	
	//private method4
	private void checkCPU()
	{
		System.out.println("Check CPU");
	}
	
}
