package JavaPracticalNaveen;

public class Car
{
	//non-static Class level variables
  String name;
  String color;
  int price;
  
//Final Static class variable
  static final int wheels=4;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//Local variable- declaration inside main-method
		final int i=10;
		
		//Declaring object1
		Car c1=new Car();
		
		//-------------------------------------------------
		//Assigning values to non-static class level variables using object reference
		c1.name="BMW";
		c1.color="White";
		c1.price=80;
		//c1.wheels=6;//Error: the final field Car.wheels cannot be assigned
		
		//----------------------------
		//Acessing class level variables inside main -method
		//Acessing non-Static  class level variable, using object reference name(c1)
		System.out.println(c1.name+" "+c1.color+" "+c1.price);//BMW white 80
		
		//Acessing static class level variable, using class name-- inside object c1
        System.out.println(Car.wheels);//4
        
        //Note: This is not a right way to call static variable using object reference name
        //Note: Here we get the output, but this is not the right way of dealing with static 
        //System.out.println(c1.wheels);//4
	//--------------------------------------------------
        
        //Declaring object 2
        Car c2=new Car();
        
        //Assigning values to non-static class variables using object reference
        c2.name="Audi";
        c2.color="Red";
        c2.price=70;
        
        //Acessing non-static class level variables-- inside object c2
        System.out.println(c2.name+" "+c2.color+" "+c2.price);//Audi red  70
        
      //Acessing static class level variables-- inside object c2
        System.out.println(Car.wheels);//4
	
        //-------------------------------------------------
        
        //Declaring object c3
        Car c3=new Car();
        
      //Assigning values to non-static class variables using object reference
        c3.name="Honda";
        c3.color="Black";
        c3.price=20;
       // c3.wheels=4;-- error
        
        //Acessing the non static class level variables -- inside object c3
        System.out.println(c3.name+" "+c3.color+" "+c3.price+" ");//Honda Black 20
        
        //Acessing the static class level variable , using class name-- inside object c3
        System.out.println(Car.wheels);//4
	}

}
/*
assignment to do
*/	
	
	
	/*notes
	1.static is the common property for all objects
	2.Inside memory, object will not hold static property
	3.Inside memory, only single copy of static property is created, and stored inside CMA
	  i.e.Commom Memory Allocation-for all objects i.static property is commonly shared and kept separately inside
	  CMA
	  
	  Note:
	  To acess static use class name .static variable name
	
	To acess non-static use object_ref_name.static variable name
	  */
	
	