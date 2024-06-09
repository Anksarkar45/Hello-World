//Medical Organisation where sservices are defined
package OOP_Interface;

public interface USMedical extends WHO {
	
	
	int min_fee=10;
	boolean is_approved=true;
	
	//interface have only   abstract methods
	//abstract method(no method body)/ only method declaration/only method prototype 
    
	//Assume: these methods are he services provided by USMedical hospital
	
	public void physioService();
	public void cardioService();
    public void dentalService();
    //common
    public void emergencyService();

    //overriding method from parent WHO-- but no use, this method has to be implemented inside child-class and not in any interface
   @Override
    public void covidVaccinationCamp();
   
   //----------------------------------------------------------------------------------
   /*
    * Question: Why interface is 100% abstraction??
   
    Answer: creating a non- abstract, non static , normal method-- not allowed  inside interface, so we say interface follows 100 percent abstraction
   
   Example:
   public void testing()
    {
 	   S.O.P
    }
    */
   //-----------------------------------------------------------------------------------
   //Debatable topic (below concept)
   
   //------------------After jdk 1.8-----------------------------------

   //static abstract method inside interface --- not allowed
   //all interface its mandate that all static methods should be given implementations
   //Example: public static billing();---error
   
  
   
   //IMP note: After jdk 1.8 - we can have static methods- with implementation - inside interface, but this method cannot be overriden inside sub-class, this is also called Method Hiding
   public static void billing()
   {
	System.out.println("US-Medical----- Billing");   
   }
   
   //IMP note:After jdk 1.8 , we can have default method with implementation inside interface(writing default keyword is mandatory in interface), which can be overriden inside subclass(but inside subclass, that method should change from default--->public)
   
   default void medicalTest()
   {
	   System.out.println("USMedical----medicalTest");
   }   

   default void medicalReport()
   {
	   System.out.println("USMedical---medical Report");
   }
}
