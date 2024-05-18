package JavaPracticalNaveen;

public class Browsers {

	String name;
	static String hq="Bangalore";
	
	public int getBrowserVersion()
	{
		System.out.println("get browser version");
		return 100;
	}
	
	public static String getBrowserVendor()
	{
		System.out.println("get browser vendor");
		return "Mozilla";
	}
	
	//Entry point of execution
	//runner body
	//calling method
	//
	public static void main(String[] args) {
		// TODO Auto
		//-generated method stub

		//calling non-static members
		Browsers obj=new Browsers();
		System.out.println(obj.name);//null
		
		obj.getBrowserVersion();//get browser version
		
		//Calling static members
		getBrowserVendor();
		System.out.println(hq);//Bangalore-- calling static directly
		System.out.println(Browsers.hq);//Bangalore--- calling static using class name
		Browsers.getBrowserVendor();
		
		//---------------------------------
		//updating the values
		obj.name="Naveen";
		obj.hq="Pune";
		obj.getBrowserVendor();
	   
	}

}
/*
output
--------
null
get browser version
get browser vendor
Bangalore
Bangalore
get browser vendor
get browser vendor
*/


//--------------notes
/*
object cannot hold static variables, static methods and static properties
static properties will be stored inside CMA- Common memory allocation, permanent generation--- metaspace
Always call static properties using class name
Object can call static properties , but with warning 
*/