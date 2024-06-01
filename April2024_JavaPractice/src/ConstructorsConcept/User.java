package ConstructorsConcept;

public class User {

	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
    String city;
    
    //Inside method-- business logic is written
    //constructors are used for restricting object creation
    //constructor are used , to initialise class variables with initial values
    
    //constructor
    public User(String firstName,String lastName)
    {
    	this.firstName=firstName;
    	this.lastName=lastName;
    }
    
    //constructor
    public User(String firstName,String lastName,String emailId)
    {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.emailId=emailId;
    }
    
    //constructor
    public User(String firstName)
    {
    	this.firstName=firstName;
    }
    
    //constructor
    public User(String firstName,String lastName,String password,String phone)
    {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.password=password;
    	this.phone=phone;
    }
    
    //constructor
    public User(String firstName,String lastName,String emailId,String phone,String password,String city)
    {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.emailId=emailId;
    	this.phone=phone;
    	this.password=password;
    	this.city=city;
    }

    //method
	public void getInfo()
	{
		System.out.println("get info");
	}
	
	//method
	public void getInfo(int i)
	{
		System.out.println("get info "+i);
	}
	
	//static members-- acessed using class name
	//non static members-- acessed using object reference name
	//constructors are acessed at the time of object creation

	//JVM main method
	public static void main(String[] args) 
	{
		//Creating object u1
	User u1=new User("Ankit","Sharma");
	System.out.println(u1.firstName+" "+u1.lastName);//Ankit Sharma

	//updating values
	u1.firstName="Anil";
	u1.lastName="Kamat";
	System.out.println(u1.firstName+" "+u1.lastName);//Anil Kamat

	//Creating object u2
	User u2=new User("Mahesh","Kumar","mahesh@gmail.com","452135896","mahesh@123","Bangalore");
	//Printing the values of object
	System.out.println(u2.firstName+" "+u2.lastName+" "+u2.phone+" "+u2.city+" "+u2.emailId+" "+u2.password);
	//Mahesh Kumar 452135896 Bangalore mahesh@gmail.com mahesh@123
	
	
	System.out.println(u2.phone);//452135896
	
	//updating values
	u2.city="pune";
	u2.phone="568921314";
	u2.password="kumar@123";
	System.out.println(u2.firstName+" "+u2.lastName+" "+u2.phone+" "+u2.city+" "+u2.emailId+" "+u2.password);
	//Mahesh Kumar 568921314 pune mahesh@gmail.com kumar@123
	}
}
/*
output
----------
Ankit Sharma
Anil Kamat
Mahesh Kumar 452135896 Bangalore mahesh@gmail.com mahesh@123
452135896
Mahesh Kumar 568921314 pune mahesh@gmail.com kumar@123
*/



//discipline
//single mind focus