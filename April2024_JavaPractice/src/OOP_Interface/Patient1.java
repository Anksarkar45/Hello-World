//user class , where implemented methods are used
//User class(pATIENT CLASS)-- having main method-- create object of class and call respective overriden interface methods
package OOP_Interface;

public class Patient1 {

	public static void main(String[] args) {
		
		//In java, we strictly cannot create object of interface
		
		//creating object of sub-class, wherein the implementation of interface methods are present
		FortisHospital fh=new FortisHospital();
		
		
		//calling overriden methods of fortis hospital (unimplemented of:USMedical) 
		fh.physioService();
		fh.cardioService();
		fh.dentalService();

		//calling overriden methods of fortis hospital (unimplemented of:UKMedical) 
		fh.neuroServices();
		fh.pediaServices();
	
		//calling overriden methods of fortis hospital (unimplemented of:UKMedical) 

		fh.oncologyServices();
	    fh.orthoServices();
	    
	    //common method
	    fh.emergencyService();
	    
	    //individual method
	    fh.medicalTraining();
	    fh.medicalClaim();
	
	  //Inheriting medicalRnD from parent class--Medical
	    fh.medicalRnD();
	    
	    //acessing overriden default methods
	    fh.medicalTest();//FortisHospital----medicalTest
	    fh.medicalReport();//FH---medical Report
	    //-------------------------------------
	    //Creating object of interface is not allowed in java
	  /*
	    USMedical us=new USMedical();--error:cannot instantiate the type USMedical
	    UKMedical uk=new UKMedical();--error:cannot instantiate the type UKMedical
	    IndianMedical im=new IndianMEdical();--error:cannot instantiate the type IndianMedical
	*/
	    //----Variables acess------------------------
	    //Example1:Acessing USMedical interface variable
	    System.out.println(USMedical.min_fee);//10
	    System.out.println(USMedical.is_approved);//true
	    
	    //note: we can never-ever-update-interface variable values because they are FINAL by nature
	    //USMedical.min_fee=200;//error--The final field USMedical.min_fee cannot be assigned
	    
	    //------------------------------------------------------
	    //Example2: Acessing  fortis hospital class variable(min_fortis_fee)
	   System.out.println(fh.min_fee);//50
	   
	   //Note: In any programming language, VARIABLE OVERRIDING IS NOT ALLOWED
	    
	    //Top Casting ---------WebDriver driver=new ChromeDriver();----------------------------------------
	    
	    //1.Top casting with USMedical interface and fortis hospital class
	    USMedical us=new FortisHospital();
	    us.cardioService();
	    us.physioService();
	    us.dentalService();
	    us.emergencyService();
	   // us.medicalTraining();---error-- this is undefined for type USMedical
	    //us.medicalClaim();---error-- this is undefined for type USMedical
	 //   us.neuroServices();     ---error-- this is undefined for type USMedical
	   // us.pediaServices(); ---error-- this is undefined for type USMedical
	    //us.oncologyServices(); ---error-- this is undefined for type USMedical
	   // us.orthoServices();	 ---error-- this is undefined for type USMedical	
	    
	
	    
	    //2.Top casting with UKMedical interface and fortis hospital class
	    UKMedical uk=new FortisHospital();
	    uk.emergencyService();
	    uk.neuroServices();    
	    uk.pediaServices();
	    //uk.medicalTraining();//----error-----error-- this is undefined for type USMedical
	    //uk.medicalClaim();------error-- this is undefined for type UKMedical
	    //uk.cardioService();---error-- this is undefined for type UKMedical
	    //uk.physioService();---error-- this is undefined for type UKMedical
	    //uk.dentalService();---error-- this is undefined for type UKMedical
	    //uk.oncologyServices();  ---error-- this is undefined for type UKMedical
	    //uk.orthoServices();		 ---error-- this is undefined for type UKMedical
	    
	    //3.Top casting with IndianMedical interface and fortis hospital class
	    IndianMedical IM=new FortisHospital();
	    IM.oncologyServices();
		IM.orthoServices();		
	    IM.emergencyService();
	   // IM.medicalTraining();//error--this is undefined for type IndianMedical
	    //IM.medicalClaim();//error--this is undefined for type IndianMedical
	   // IM.cardioService();---error-- this is undefined for type IndianMedical
		/*
		 * IM.physioService();---error-- this is undefined for type IndianMedical
		 * IM.dentalService();---error-- this is undefined for type IndianMedical
		 * IM.neuroServices(); ---error-- this is undefined for type IndianMedical
		 * IM.pediaServices();---error-- this is undefined for type IndianMedical
		 */	
	
	    //4.TopCasting with grandparent interface and sub class
	    WHO wh=new FortisHospital();
	    wh.covidVaccinationCamp();
	    
	    
	    //DowncASTING AT COMPILE TIME--- NOT POSSIBLE 
	    //FortisHospital fh=new USMEdical();
	    
	    //Real project example of selenium for top casting
	    //WebDriver driver =new ChromeDriver();
	    
	    
	    
	}

}
