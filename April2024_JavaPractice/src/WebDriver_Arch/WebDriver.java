package WebDriver_Arch;

public interface WebDriver extends SearchContext{
	
	//abstract method1: no return but some input
	public void get(String url);
	
	//abstract method2: no input,some return
	public String getTitle();
	
	//abstract method3
	public void click(String element);
	
	//abstract method4
	public void sendKeys(String element,String value);
	
	//abstract method5
	public void close();

	//overriding method from parent interface
	@Override
	public void findElement(String element);
}
