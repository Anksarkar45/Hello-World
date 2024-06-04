//Runner class
package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---Sibling1: BMW object properties---");
		//Creating object of BMW class(child class) inside TestCar class
		
		BMW b=new BMW();
		
		//OVERRIDEN method of BMW class -- from Car(parent class)
		b.start();//BMW--start
		
		//Overriden method of BMW--- from Vehicle(grand parent)
		b.petrolEngine();//BMW- petrol engine
		
		//INHERITED method of BMW class
		b.stop();
		
		//INHERITED METHOD of BMW
		b.refuel();
		
		//INDIVIDUAL method of BMW
		b.autoParking();
		
		//acessing properties of grandparent class
		b.engine();
		
		//One child(BMW) class-- cannot inherit from another child(Audi)
		//b.theftSafety();
		
		b.autoParking();
		
		//inherited method of BMW
		b.service(); //Car Service
		
		//Case1 //Static method of BMW
		b.billing();//BMW bILLING
		
		
		//case 2//Static method of BMW-- unique case
		b.billing();//Car billing
		//NOTE(unique calling case): IF BMW is not having static billing(),then while acessing billing() using bmw object, it will inherit static billing() of parent class  
		//Note: Reverse not true, parent cannot acess billing
		System.out.println("---Parent :Car object properties---");
		
	

		
		//Creating object of Car class(parent class) inside TestCar class
	    Car c=new Car();
	   //individual method  of Car-class
	    c.start();
	   
	  //individual method of Car-class
	    c.stop();
	    
	  //individual method of Car-class
	    c.refuel();
	    
	  //inherited method of Car-class
	    c.engine();
	    
	    //individual method of child class
	    //c.autoParking();//Error:Car class cannot acess individual properties of BMW
				
	    
	    //Note
	    //1.Parents cannot take any properties from child, only child can take properties of parent
	
	    //2.By creating object of parent class, we can acess only parent class properties only(and not from child class)
	    
	    //Inherited method of Car class-- from its parent (Vehicle)
	    c.petrolEngine(); //Vehicle--petrol engine
	    
	    //------Static calling----------
	    //Case1: calling static method of Car
	    //c.billing();//Car-billing
	    
	    //case2: calling static method -- from BMW
	    //c.billing();//Error: method billing is undefined for the typr car
	    
	    System.out.println("---------------Sibling2: Audi object properties---");
	    Audi a=new Audi();
	    a.autoParking();
	
	    System.out.println("---Key Notes-----------");
	  //1.Java can create only objcts without references
	  		new BMW();
	  		
	  		System.out.println("----Top Casting----");
	  		//2.Child class objects, can be referred/stored inside parent class variables(even grand parent class)
	  		Car c1=new BMW();
	  		Vehicle v1=new BMW();
	  		
	  		c1.start();//BMW start----overriden method of BMW(overriden from parent Car)
	  		c1.stop();//car--stop---individual method of Car/inherited method of BMW
	  		c1.refuel();//Car--refuel---individual method of Car/inherited method of BMW
	        //c1.autoParking();//unique individual method of BMW
	        c1.petrolEngine();//BMW-petrol engine--overriden method of BMW from grandparent
	        //c1.theftSafety();//copied individual method from its sibling
	  
	        //------------------------------------------------------------------------
	       //---TOP Casting/upcasting notes-----------------
	        
	        //we are able to acess only overriden methods and individual methods of reference variable type class
	       //Inside memory- all methods are loaded(reference type and object type)
	        //we are not able to acess. individual methods of object TYPE clas- because in object type class-- reference type check is failing
          //In Top Casting , reference type check , will be failed, for the indivual methods of Object type class	
	
	        System.out.println("----Down casting------");
	//-----------Down Casting
	        //Parent class objjwect stored inside child class reference
	        //down casting allowed at compile time
	        //down casting not allowed , at run time, we get Class Cast exception
	        
	        //BMW b1=(BMW)new Car();
	        //b1.start();//Compiler will not throw error in coding, but after executing we get <Class Cast exception>
          
	        //BMW b2=(BMW)new Vehicle();//DownCasting// Class Cast Exception at run time-- comple time no error
	
	//-----TopCasting with super grand parent class
	        Science sc=new BMW();
	        sc.sci();
	}

}
