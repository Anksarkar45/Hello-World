package JavaPracticalNaveen;

public class Customer {

	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String DOB;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object and printing default values of class- level variables
		Customer c1=new Customer();
		System.out.println(c1.name);//null (name:String)
		System.out.println(c1.age);//0 (age:int)
		System.out.println(c1.salary);//0.0(salary:double)
		System.out.println(c1.gender);//blank (gender:character)
		System.out.println(c1.isActive);//false(isActive:boolean)
		System.out.println(c1.DOB);//null(String: DOB)

		//Updating class level values(Reassigning values)---within same object

		c1.name="Upahar";
		System.out.println(c1.name);//Upahar

		//--------------------------
		//Multiple ways to create an object
		//Type1 --- object without reference variable
		new Customer().name="Peter";
		
		//Type2: Object with reference variable
		Customer c2=new Customer();
		
		//Type3:No object , just reference
		Customer c4;
		
		//Type4: Object with null reference
		Customer c5=new Customer();
		c5=null;
		
	    //Type5: Creating objects in 2 steps
		Customer c8;
		c8=new Customer();
		
		
		//---------------------------
		//Assigning one object reference inside another object reference
		
		Customer c6=new Customer();
		Customer c7=new Customer();
		c6=c7;
//Note: Here c6 object holds c7 object	
	
	
	}

}

//Daily practice
//work hard
//Love working on skills
//Problem solving
//communication and wiseness
//think n talk
//trial and  error--- check it and then believe it--- practically--- different combination
//gain knowledge of that thinklg-- explore
//listen, observe, try patiently, get output, stay calm, speak short, show result, talk money wise
//jugaad and get output