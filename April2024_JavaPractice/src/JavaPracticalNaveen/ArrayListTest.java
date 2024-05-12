//Working with dynamic array  Object-type array list 
//In object type-- we can add homogeneous values(i.e values of all type data types)

package JavaPracticalNaveen;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) 
	{
	    //Declaring dynamic array, of arrayList type - generics
		ArrayList<Object> ar=new ArrayList<Object>();
		
		//Adding elements 
		
		//integer value
		ar.add(100);
		
		//string value
		ar.add("testing");
		
		//character value
		ar.add('h');
		
		//boolean value
		ar.add(true);
		
		//Printing values using for loop
		for(Object e:ar)
		{
			System.out.println(e);
		}
		
		System.out.println(ar);//[100, testing, h, true]
		
		//System.out.println(Arrays.toString(ar)); -- Not applicable for arrayList<Generics>

	}

}

//live by my own self belief and divinty and core values
