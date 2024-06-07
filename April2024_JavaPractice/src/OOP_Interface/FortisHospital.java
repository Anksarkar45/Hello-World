//Hospital-- where services of medical organisation are implemented

//Story

	// Implementing/overriding methods from USMedical-interface
	// FortisHospital wants to open the branch of USMedical in India and implement
	// all the services of USMedical (as per the rules of USMedical)

package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical 

//Order must be same: <SUBCLASS FIRST EXTENDS PARENT CLASS(ONLY ONE PARENT CLASS IS ALLOWED) ,THEN IMPLEMENTS PARENT INTERFACES(MULTIPLE PARENT INTERFACES ALLOWED)>

//public class FortisHospital implements USMedical,UKMedical,IndianMedical extends Medical--- ERROR
{

	int min_fee=50;
	
	@Override
	public void physioService() {
     System.out.println("FortisHospital--physioService");
	}

	@Override
	public void cardioService() {
   System.out.println("FortisHospital--- cardioService");
	}

	@Override
	public void dentalService() {
    System.out.println("FortisHospita----dentalService");
	}
    
	
	// Implementing / overriding methods from USMedical Interface
    @Override
    public void neuroServices()
    {
    	System.out.println("FostisHospital---neuroService");
    }
    
    @Override
    public void pediaServices()
    {
    	System.out.println("FortisHospital---pediaService");
    }
    
    //Implementing methods from IndianMedical Interface
    @Override
    public void oncologyServices()
    {
    	System.out.println("Fortis Hospital---oncology");
    }
    
    @Override
    public void orthoServices()
    {
    	System.out.println("Fortis Hospital ---orthoservices");
    }
    
    //common - across USMEdical,USMedical, Indian Medical--- overrden ONLY ONCE inside child class
    //We cannot have duplicate method implementation in child class
    @Override
    public void emergencyService()
    {
    	System.out.println("FortisHospital --------Emergency service");
    }
    
    //Fortis Hospital---individual methods
    public void medicalTraining()
    {
    	System.out.println("Fortis Hospital---medical Training");
    }
    
    public void medicalClaim()
    {
    	System.out.println("Fortis Hospita---medicalClaim");
    }

    //from WHO -- grandparent interface
	@Override
	public void covidVaccinationCamp() {
 
		System.out.println("Fortis Hospital---- covidVaccinationCamp");
		
	}
	
	//Overriding MedicalRnd() fromparent-medical class
	@Override
	public void medicalRnD()
	{
		System.out.println("FortisHospital ---medicalRnD");
	}
	
	//--------Acessing interface methods after jdk 1.8-------------------------------------------------------------------------
	//(static methods) //This method will becom METHOD HIDNG
	
	
	//@Override-- we cannot override static methods which is having method body from interface inside sub class
	//Method hiding
	public static void billing()
	{
		System.out.println("Fortis Hospital--- billing");
	}
	
	
	//---------------------------------------------------------------------------------------------------
	//(default methods)
	//Overriding default method from USMedical interface
	//Its a interface default method only, which can be overriden (without using default keyword and replacing it with public keyword)
	/*
	@Override
	public void medicalTest()
	   {
		   System.out.println("FortisHospital----medicalTest");
	   }   
*/
	@Override
	public void medicalReport()
	   {
		   System.out.println("FH---medical Report");
	   }
	}


