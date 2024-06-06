package StringManipulation;

public class StringMethods {

	public static void main(String[] args) {
	
    //String declaration  
	String s="This is my java code in my study intent";
      
	//1.length()-----gives total character in array
	int len=s.length();
      System.out.println(len);//20
      //-------------------------------------------------
      //2.charAt(index_pos)----gives value at that index_pos 
	 System.out.println(s.charAt(3));//s (note: indx starts with zero always )
	 System.out.println(s.charAt(19));//e
	// System.out.println(s.charAt(20)); //SIOB
	//System.out.println(s.charAt(-1));
	
	 
	 //----------------------------------------------
	//3.indexOf('value')---- gives index_position
	 //note: applicable only for static character scenario
	 
	System.out.println(s.indexOf('e'));//19
	System.out.println(s.indexOf('i'));//2 --first occurence of 'i'
	System.out.println(s.indexOf('i',3));//5---- second occurence of 'i'
	System.out.println(s.indexOf('i',6));//21---third occurence of 'i'
	System.out.println(s.indexOf('i',22));//33--- fourth occurence
	System.out.println(s.indexOf('i',34));//-1--- no occurence of character---hence it gives (-1)
	
	   //---------------------------------(dynamic strng--character--indexOf()
	
	//Strings get changed, position of values get updated -to fnd correct occurences- ireespective of changing position, alter the formula 
	String s1="hello This is my javacode i am so happy";
	//length
	System.out.println(s1.length());//40//39
	//1ST OCCURENCE(dynamic string scenario)
	System.out.println(s1.indexOf('i'));//8
	
	//2nd OCCURENCE--12th position-- dynamic string
	System.out.println(s1.indexOf('i',s1.indexOf('i')+1));//12//11
	
	//3rd occurence of 'i' is 27 position
	//+1--- 1st index
	//+1----2nd index
	//Note: add next indexxOf() inside 'i'bracket but +1 outside bracket
	System.out.println(s1.indexOf('i',s1.indexOf('i',s1.indexOf('i')+1)+1));//27//26
	
	  //------ indexOf find of specific string-word 
	System.out.println(s1.indexOf("javacode"));//17
	
	//tryng to find index of specific word- not available in string
	System.out.println(s.indexOf("testingunknownword"));//-1 
	
	//selenium example -- use case of indexOf()--Check whether string <admin> is avaible at specific position--- solution : use indexOf()
	String message="Welcome Admin";
	//accurate code
	if(message.indexOf("Admin")==8)
	{
		System.out.println("PASS");
		}
	else
	{
		System.out.println("FAIL");
	}
	
	//alternate -- inaccurate code
	if(message.indexOf("Admin")>8)
	{
		System.out.println("PASS");
		}
	else
	{
		System.out.println("FAIL");
	}
	
	//-------------------------------------------
	//4  .trim()
	String test="   Hello Ankita  ";
	System.out.println(test);
	System.out.println(test.trim());
	
	//----------------------------
	//5a.toUpperCase() and 5b.toLowerCase()
	String t="hello this is a java code";
	System.out.println(t.toUpperCase());//HELLO THIS IS A JAVA CODE
	System.out.println(t.toLowerCase());//hello this is a java code
	
	//---replace() ------------------------
	String DOB="11-03-1991";
	System.out.println(DOB.replace('-', '/'));//11/03/1991
	
	String test1="    hello  world of spaces  ";
	System.out.println(test1.replace(" ", ""));//helloworldofspaces
	//Note : replace() removes before-space, after-space and in-between space
	//Note: trim() removes before-space and after-space only
	
	/*
	//String comparision -- detail working
		
	//newobject  (samedata)
	String l1=new String("newSame");
	String l2=new String("newSame");
	
	//newobject (different data)
	String l3=new String("newDiff1");
	String l4=new String("newDiff2");
	
	//literalobject (samedata)		
	String st1="litSame";
	String st2="litSame";
	
	//literalobject(different data)
	String st3="litDiff1";
	String st4="litDiff2";
	//------------------comparision combination
	//samedata
	//compare1: samedata(new)(==)
	System.out.println(l1==l2);//false
	
	//compare2: samedata(new)(equalmethod)
	System.out.println(l1.equals(l2));//true
	//compare3: same data(literalobj)(==)
	System.out.println(st1==st2);//true
	
	//compare4: same data(literal object)(equalsmethod)
	System.out.println(st1.equals(st2));//true
	
	//differentData
	//compare5:(different data)(newobject)(==)
	System.out.println(l3==l4);//false
	
	//comare6: (different data)(newobject)(equals)
	System.out.println(l3.equals(l4));//false
	
	//compare 7:(diiferent)(literals)(==)
	System.out.println(st3==st4);//false
	
	//compare8: (different)(literalobject)(equalsmethod)
	System.out.println(st3.equals(st4));//false
	
	output
	--------
	false
	true
	true
	true
	false
	false
	false
	false
	
	notes: String comparision
	== compares memory address
	equals compares string data
    internal memory visualise
    In SCP(literal object)- duplicates data management in memory-->, 2 reference variables point to (same  data)(SAME object)- (2 different memory adress of reference variables
    In Heap(new key object)-, duplicates data management in memory ---> 2 reference variables point to (same data)(DIFFERENT object)-- 2 different memory address of reference variable- 
*/
	 }

}

/*
 * output
 * ----------
 * 39
s
e
19
2
5
21
33
-1
39
8
11
26
17
-1
PASS
FAIL
   Hello Ankita  
Hello Ankita
HELLO THIS IS A JAVA CODE
hello this is a java code
11/03/1991
helloworldofspaces
false
	true
	true
	true
	false
	false
	false
	false
 * 
 * */



