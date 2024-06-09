package OOP_Abstract;

public abstract class Page {

	public abstract void title();
	
	
	public abstract void url();
	
	
	public void pageLoadTimeOut()
	{
		System.out.println("Page time out---10 sec ");
	}
	
	public final void displayLogo()
	{
		System.out.println("display logo");
	}
	

}
	 