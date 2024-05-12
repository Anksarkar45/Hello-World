//value time--- value my self --- value my work--- dont value people
//Focus---consistency---task completion--- self survival
//Classes and Object concept

package JavaPracticalNaveen;

public class Employee {

	//Class Level variable, class level data members
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		 
		//Local level variable
		String name="Naveen";
		
		//What is a class: Its a template/blueprint of the object/category of object
		//What is an object: An object is a physical entity. We create an obje t of the class using <new> keyword
		
		//--------------------------------------
		//object1 creation using <new keyword+reference variable>
		Employee obj1=new Employee();
		
		//Assigning values to class level variables- with help of object
		obj1.name="Tom";
		obj1.age=20;
		obj1.city="LA";
		
		//Printing class level values
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.city);//Tom 20 LA
		
		//--------------------------------------
	    //Object2 declaration
		Employee obj2=new Employee();
		
		//Printing obj2 values(before assigning)
		System.out.println(obj2.name);//null
		System.out.println(obj2.age);//0
		System.out.println(obj2.city);//null
		System.out.println(obj2.name+" "+obj2.age+" "+obj2.city);//null 0 null
	            
	  //Note: In the above obj2 we are printing the default values of the class level variables - using obj2
		
		//Updating the values of class-level variables <name>
		obj2.name="Naveen";
		
		
		//Printing the updated values
		System.out.println(obj2.name);//Naveen
		System.out.println(obj2.age);//0
		System.out.println(obj2.city);//null
		
		//-------------------------------------------------
		//Printing values of class level variable--of obj1 and obj2
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.city);//Tom 20 LA
		System.out.println(obj2.name+" "+obj2.age+" "+obj2.city);//Naveen 0 null
		
		//Creating object <new key+ without using reference variable> --- its allowed in java, but not recommended
		new Employee().name="Peter";
		new Employee().age=30;
	    new	Employee().city="Mumbai";
	}

}
