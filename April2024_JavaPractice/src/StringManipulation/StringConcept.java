package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	//String is a Class in java
	
	//1.Creating String objects using literals	
	String s="Hello";
    String s1="Hello";
    String s2="hello";
    
    System.out.println(s==s1);//true
    System.out.println(s1==s2);//false
    
    //Creating string object using new keyword
    String st=new String("Java");
	String st1=new String("Hello");
	
	//Comparision
	System.out.println(s==st1);//false
	System.out.println(s.equals(st1));//true
	/*
	Note:
		(==) compares memory adress of reference variables
	    equals() compares exact literal values
	*/
	

	String st2=new String("Hello");
	
	//-------------------------------------------------------
	//Concept of intern()
	String test=new String("HelloJiSCP");//----one object created in HEAP and reference pointing to <test> variable
	test.intern();//---One object created in SCP , with same value (HelloJiSCP) without any reference variable 
	String t1="HelloJiSCP"; // no object created reference pointing to <test> variable
	
	//Conclusion: Using intern() , using 3 object initiation statement , only in memory 2 objects get created inside memory , when we use intern-method
	//-----------------------------------------
	
	//Creating string object without any value
	String st4=new String();
	System.out.println(st4.length());//0
	}
	
	

}
 