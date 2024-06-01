package Oops_Encapsulation;

public class LoginPage {

	// PRIVATE MEMBERS
	// global variables
	private String userName;
	private String password;

	//methods
	private boolean isUserActive(String un) {
		System.out.println("checking user status" + un);
		return true;
	}

	// ---------------------------
	// PUBLIC MEMBERS
	// constructor
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// fetch the values of global variables
	//METHODS 
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username:" + un);
		System.out.println("enter password:" + pwd);
		System.out.println("click on login button");

		if (isUserActive(un)) {
			System.out.println("user is logged .....");
		} else {
			System.out.println("user is inactive...account blocked...");
		}
	}

	
}
