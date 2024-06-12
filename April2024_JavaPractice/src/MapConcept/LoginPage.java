//Role based acess codes-- storing user roles and their credentials inide map data structure
//When user provides that specific role data, coressponding credentials get printed
//HashMap use case
package MapConcept;

import java.util.HashMap;

public class LoginPage {

	public static String getUserCred(String role)
	{
		HashMap<String,String> credMap=new HashMap<String,String>();
	    credMap.put("admin", "admin@az.com;admin123");
	    credMap.put("customer", "customer@gmail.com;cust123");
	    credMap.put("seller", "seller@goibio.com;seller123");
	    credMap.put("catalog_Manager", "catalog@myntra.com;catalog123");
	    return credMap.get(role);
	}
	
	//doLogin()
	
	public static void doLogin(String un,String pwd)
	{
		System.out.println("login with: "+un+ ":"+pwd);
	}
	
	public static void main(String[] args) {
		//System.out.println(getUserCred("admin"));//admin@az.com;admin123

		/*
		 * -----checking split features------
		 String cred[]=getUserCred("admin").split(";");
		 System.out.println(cred[0]);//admin@az.com
		 System.out.println(cred[1]);//admin123
		 System.out.println(cred[2]);//AIOB
        */	
		
		//Actual code
		
		String cred[]=getUserCred("admin").split(";");
		String cred1[]=getUserCred("customer").split(";");
		String cred2[]=getUserCred("seller").split(";");
		String cred3[]=getUserCred("catalog_Manager").split(";");
		
		
		String un=cred[0].trim();
		String pwd=cred[1].trim();
		String un1=cred1[0].trim();
		String pwd1=cred1[1].trim();
		String un2=cred2[0].trim();
		String pwd2=cred2[1].trim();
		String un3=cred3[0].trim();
		String pwd3=cred3[1].trim();
		
		
		doLogin(un,pwd);
		doLogin(un1,pwd1);
		doLogin(un2,pwd2);
		doLogin(un3,pwd3);
	}

}
