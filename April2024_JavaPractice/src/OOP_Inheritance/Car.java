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
	
	
	/*
	@Override
	public void petrolEngine()
	{
		System.out.println("Car-- petrol engine");
	}
	
	*/  
}
