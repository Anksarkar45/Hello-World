package OOP_Inheritance;

public class Car extends Vehicle {


	//Individual method of Car class
	//Overriden method of BMW-class
	public void start()
	{
		System.out.println("Car--start");
		
	}
	
	
	//Individual method of Car class
	//Inherited method of BMW-class
	public void stop()
	{
		System.out.println("Car-- stop");
	}
	
	//Individual method of Car class
	//Inherited method of BMW-class
	public void refuel()
	{
		System.out.println("car--- refuel");
	}
	
	//Individual final method-- car class
	//Inherited method of BMW
	public final void service()
	{
		System.out.println("Car service");
	}
	
	
	@Override
	public void petrolEngine()
	{
		System.out.println("Car-- petrol engine");
	}
	
	//static method
	/*public static void billing()
	{
		System.out.println("Car-- billing");
	}
	*/
	
	//private method
	private void pickcolor()
	{
		System.out.println("Car-- pickcolor");
	}
}

//---final concept notes
//---------------------------------------------
//1.Purpose of final keyword for methods in parent class, is to restrict method overrding inside child class
//2.Eg: logo method in website pages are final 
//3.When class is declared as final-- it is used to prevent inheritance-- that particular class is not be elligible to become parent-class
//4.When method is declared final--- that method prevents method overriding inside child class
//5.When final is declared for variables, its for constant values, whose values cannot be changed

//Note:To prevent inheritance or overriding of methods inside child classes-- use Final keyword.
//When to use : In inheritance, if a parent class,want to prevent method override in child class, in that scenario declare the final class method as private.
//Real time example: If we override LOGO() of homepage class ,in all pages , the all page class(Registeration page, product page)- then all the pages will try to change the logo , which is not allowed, hence we use final