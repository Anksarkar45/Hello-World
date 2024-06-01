package JavaPracticalNaveen;

public class LoginTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(LoginPage.forgotPwdLinkExist())
		{
			System.out.println("change ur pwd");
		}
		
		LoginPage lp=new LoginPage();
		lp.doLogin("Naveen@gmail.com","Naveen@1234");
	}

}

/*
 *
 * Checking forgot pwd link on the page
   change ur pwd
   Login with: Naveen@gmail.com:Naveen@1234
   Logged in
 *
 */