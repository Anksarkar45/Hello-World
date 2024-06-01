package JavaPracticalNaveen;

public class LoginPage {
public static boolean forgotPwdLinkExist()
 {
	System.out.println("Checking forgot pwd link on the page");
	return true;

	}

public void doLogin(String un,String pwd)
{
  System.out.println("Login with: "+un+":"+pwd);
  System.out.println("Logged in");
}
}
