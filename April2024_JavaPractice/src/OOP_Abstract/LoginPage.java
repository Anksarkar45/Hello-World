package OOP_Abstract;

public class LoginPage extends Page {
	@Override
	public void title()
	{
		System.out.println("Login t itle");
	}

	@Override
	public void url()
	{
		System.out.println("https://www.abc.com/login.html");
	}
	
	public void pageLoadTimeOut()
	{
		System.out.println("page load time out----5 seconds");
	}
	
}
