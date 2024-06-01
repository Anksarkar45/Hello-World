package OOP_Inheritance;

//Audi is child2 of parent-Car
public class Audi extends Car{

	//Individual Method 
	public void theftSafety()
	{
		System.out.println("Audi-- theftSafety");
	}

	//Individual method-- but copied the same name from its SIbling BMW
	public void autoParking()
	{
		System.out.println("Audi--autoParking");
	}
}
