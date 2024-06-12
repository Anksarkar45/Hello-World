package MapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) 
	{
		//Generics: String,String
	 HashMap<String,String> empMap=new HashMap<String,String>();
	 
	 //Inserting values inside hash map
	 empMap.put("A", "Tom");
	 empMap.put("B", "Peter");
	 empMap.put("C", "Robert");
	 
	 //Fetching values from hash map and printing it on console
	 System.out.println(empMap.get("A"));
	 
	//Generics: String,Integer
	 //Storing student data inside hashmap with String and integer generics
	 HashMap<String,Integer> studentMap=new HashMap<String,Integer>();
	 studentMap.put("Tom", 100);
	 //duplicate keys--- prints only one latest updated key value
	 studentMap.put("Peter", 200);
	 studentMap.put("Peter", 300);
	 
	 //duplicate values
	 studentMap.put("Naveen", 500);
	 studentMap.put("Harleen", 500);
	 
	 //duplicate null keys--- prints only one latest updated(500) key value- null is always the first value
	 studentMap.put(null, 400);
	 studentMap.put(null, 500);
	 
	 //Print the hashMap values on the console-- using formula
	 System.out.println("===================");
	 studentMap.forEach((k,v)-> System.out.println(k+":"+v));
	 
	 /*
	  * 
	  * ===================
		null:500
		Tom:100
		Naveen:500
		Harleen:500
		Peter:300
		===================
	  
	  */
	 System.out.println("===================");
	 
	//Fetching values from hash map and printing it on console
		 System.out.println(studentMap.get("Peter"));//300
		 System.out.println(studentMap.get(null));//500
		 
		//Generics: Integer,String	 
	HashMap<Integer,String> userMap=new HashMap<Integer,String>();
	userMap.put(101, "Tom");
	}

}
