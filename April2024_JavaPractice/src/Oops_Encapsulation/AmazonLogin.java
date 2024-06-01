package Oops_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//Creating object , to acess methods and constructor of LoginPage class , present within same package
		LoginPage lp=new LoginPage("pooja@gmail.com","pooja@123");
        
		//login
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		System.out.println("----------------");
		//reset username
		lp.setUserName("pooja456@gmail.com");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		System.out.println("-------------");
		//reset password
		lp.setPassword("pooja@456");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
	}

}
//travel abroad via work for 5 years