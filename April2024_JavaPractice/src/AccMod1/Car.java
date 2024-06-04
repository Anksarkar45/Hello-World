package AccMod1;

public class Car 
{
//non static global variables	
	
  //public variable
	public String name;
  
  //protected variable
  protected int price;
  
  //private variable
  private int milg;
  
  //default variable
  String brand;
  
  public static void main(String[] args)
  {
	  Car c=new Car();
	  
	  //Same class same package
	  c.name;
	  c.price;
	  c.milg;
	  c.brand;
	  
  }
}
