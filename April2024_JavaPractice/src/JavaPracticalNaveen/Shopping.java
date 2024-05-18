package JavaPracticalNaveen;

public class Shopping {

	public void test()
	{
		System.out.println("test method");
	}
	
	public int test(double d)
	{
		System.out.println("test method");
		return 100;
	}
	
	public void test(int i)
	{
		System.out.println(i);
	}
	
	public void test(int i,int j)
	{
		System.out.println(i+j);
	}
	
	public void test(String p)
	{
		System.out.println(p);
	}
	
	public void test(String p,int q)
	{
		System.out.println(p+q);
	}
	
	public void test(int p,String q)
	{
		System.out.println(p+q);
	}
	
	//use case real time---- login() overloaded
	public void login()
	{
		
	}
	
	public void login(String un,String pwd)
	{
		
	}
	
	public void login(String un,String pwd,String role)
	{
		
	}
	
	//Search feature -- search() overloaded
	public void search()
	{
		
	}
	public void search(String productName)
	{
		
	}
	public void search(String productName,int price,String color)
	{
		
	}
	
	//payment feature--- pay using upi, credit card, debit card,paypal,stripe ----- doPayment() overloaded
	public void doPayment(String upi)
	{
		
		
	}
	public void doPayment(String cc,int cvv)
	{
		
	}
	
	public void doPayment(int cvv,String dc)
	{
		
	}
	public void doPayment(String paypal,String pwd,int otp)
	{
		
	}
	public void doPayment(String stripeid,int otp, String key)
	{
		
	}
	
	//uber booking app---booking()
	public void booking(String carType,String fromLocation,int passengers)
	{
		
	}
	
	public void booking(String carType,String FromLocation,String ToLocation,int passengers)
	
	{
		
	}
	
	public void booking(String carType,String fromLocation,String toLocation,int passengers,String paymentOptions)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shopping shop=new Shopping();
	   shop.login();
	   shop.booking("nano", "belgaum", 5);
	   shop.doPayment("abc#upi");
	}

}
