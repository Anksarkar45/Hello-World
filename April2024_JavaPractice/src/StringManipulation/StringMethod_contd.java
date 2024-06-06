package StringManipulation;

import java.util.Arrays;

public class StringMethod_contd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "hello world";
		String st1 = "hello World";

		System.out.println(st == st1);// compares memory address//false
		System.out.println(st.equals(st1.equals(st1)));// false
		System.out.println(st.equalsIgnoreCase(st1));// true

		// --------equalsIgnoreCase()
		String browser = "  Chrome";
		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Pass");// pass
		}

		// contains()
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));// true

		// Assignment: execute the above logic using indexof method

		// System.out.println(p.indexOf(8)=="selenium");

		// -------split()
		// Example1
		String lang = "JAVA_PYTHON_DOTNET_RUBY";

		// Before split
		System.out.println(lang);// JAVA_PYTHON_DOTNET_RUBY

		String stringarrayvariable[] = lang.split("_");
		System.out.println(Arrays.toString(stringarrayvariable));// [JAVA, PYTHON, DOTNET, RUBY]
		System.out.println(stringarrayvariable);// [Ljava.lang.String;@6d06d69c

		// note: Observe that we cannot print static-array variable directly inside SOP,
		// it gives memory object address
		// note to print array using SOP, use Arrays.toString()- in that pass the array
		// variable reference
		// note: split() returns string array[] always

		// Checking the length of string array, after splitting ,the original string
		System.out.println(stringarrayvariable.length);// 4

		// Acessing the string-array data after splitting
		System.out.println(stringarrayvariable[0]);// JAVA
		System.out.println(stringarrayvariable[1]);// PYTHON
		System.out.println(stringarrayvariable[2]);// DOTNET
		System.out.println(stringarrayvariable[3]);// RUBY

		// Example2: split()
		// String pop="xXseleniumxXXtestingXxXJavaXxXpythonX";
		String pop = "XseleniumxXXtestingXxXJavaXxXpythonX";
		// applyng split() on pop-- which returns string array
		String s[] = pop.split("X");
		System.out.println(Arrays.toString(s));
		System.out.println(s[0]);// x

		/*
		 * //Scenario: Split string and Calculating the first index by not providing any
		 * value at zero index String pop="XseleniumxXXtestingXxXJavaXxXpythonX";
		 * System.out.println(s[0]);//prints nothing
		 * System.out.println(Arrays.toString(s));
		 * 
		 * note:Space v/s nothing :(Observe: Space is value inside string, nothig is
		 * different and space is different) note: output for nothing at zero position:
		 * [, seleniumx, , testing, x, Java, x, python]
		 */

		// Example 3: split()-- real time use case
		// Splitting employee information
		String empInfo = "madhav|singh|pune|india|ibm|sdet";
		String emp[] = empInfo.split("\\|");
		for (String e : emp) {
			System.out.println(e);//madhavsinghpuneindiaibmsdet
		}
		
		//STRING CONVERSION
		/*
		 * Coverting staring varaible to any other variable use:
		 * 
		 * Integer.parseInt(var)
		 * Double.parseDouble(var)
		 * Boolean.parseBoolean(var)
		 * 
		 * Note: To convert any other varaible to string variable use : valueOf()
		 * String.valueOf(var)
		 * */
		
		//Example1: concatenating sTRING 100 to integer 20
		String x="100";
		//no conversation, just concatenation
		System.out.println(x+20);//10020
		
		
		//Example2: Converting string 100 to integer 100 and then concatenating
		String x1="100";//step1:original value
		int i=Integer.parseInt(x1);//step2:converting 
		System.out.println(i+20);//Step3:concatenating and printing//120
	
	//Example3: String to double
		String v="12.33";
		System.out.println(v+10);//12.3310
		double d1=Double.parseDouble(v);
		System.out.println(d1+10);//22.33
		
		//Example: String to boolean
		String flag="true";
		//checking string variable before conversion
		/*
		if(flag)//compile error-- because flag is string variable
		{
			System.out.println("run test");
		}
		else
		{
			System.out.println("avoid test");
		}
		
		//Converting the string variable to boolean
		boolean flag1=Boolean.parseBoolean(flag);
		
		//checking string variable after conversion 
		if(flag1)//no - error, because flag is boolean variable
		{
			System.out.println("run test");
		}
		else
		{
			System.out.println("avoid test");
		}
		*/
		//Example4: any other type to String-- use valueOf()
		//int to String
		int k=1100;
		System.out.println(k+20);//1120
		//converting to <k> string
		String k1=String.valueOf(k);
		System.out.println(k1+20);//112020
		
	}

}
