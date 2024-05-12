package JavaPracticalNaveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//------------------------------------------------------
		//DEclaring dynamic array- of integer generics of size 20
		ArrayList <Integer> ar=new ArrayList<Integer>(20);
	    System.out.println(ar.size());//0
	    //virtual capacity=20, physical capacity=0
		
	    //----------------------------------------------------------
		//DEclaring dynamic array- of integer generics of size 0
		ArrayList<Integer> numList=new ArrayList<Integer>();
		System.out.println(numList.size());//0
		//virtual capacity=0,physical capacity=0
		
		//Adding elements 
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());//4
		//Fetching element at index 1
		System.out.println(numList.get(1));//200
		//Printing elemnts of dynamic array
		System.out.println(numList);//[100, 200, 300, 400]
		
		
		//Removing element 200, present at index:1
		numList.remove(1);//element at index 1(200) will be removed
		
		System.out.println(numList.size());//3
		//Printing elemnts of dynamic array
		System.out.println(numList);//[100, 300, 400]
				
		
		//Fetching element at index 1
		System.out.println(numList.get(1));//300
		
		//------------------------------------------
		//Declaring array and adding values to dynamic array
		ArrayList<String> empList=new ArrayList<String>(Arrays.asList("Tom","Peter","Robin","Ravi"));
		//Printing size
		System.out.println(empList.size());//4
		//Printing elements of array
		System.out.println(empList);//[Tom, Peter, Robin, Ravi]
		
		//updating array by adding new elements-- using add()
		empList.add("Lisa");
		System.out.println(empList);//[Tom, Peter, Robin, Ravi, Lisa]
		
		//size
		System.out.println(empList.size());//5
		
		//Updating array list , by adding element at specific index -- add(index,element)
		empList.add(4, "shubhada");
        System.out.println(empList);//[Tom, Peter, Robin, Ravi, shubhada, Lisa]

        //checking the list by adding element at , size beyond actual size
        //empList.add(7,"extra");//IndexOutOfBoundException
        //System.out.println(empList);
        
        
        //---------------------------------------
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        System.out.println(nums.size());//5
		
        //----------------------Declaring and initialising 
        List<String> PagesList=Arrays.asList("LoginPage","HomePage","RegisterPage","CartPage");
        System.out.println(PagesList);//[LoginPage, HomePage, RegisterPage, CartPage]
        
        //------------------------------declaring and inialising
        
        ArrayList<Integer> nList=new ArrayList<Integer>();
        nList.add(100);
        nList.add(260);
        nList.add(10);
        nList.add(4000);
        nList.add(40);
        nList.add(5);
        System.out.println(nList);//[100, 260, 10, 4000, 40, 5]
        
        //sorting in ascending order--- using 'Collections'
		Collections.sort(nList);	
		System.out.println(nList);//[5, 10, 40, 100, 260, 4000]

		//Reversing the sorted 
		Collections.reverse(nList);
		System.out.println(nList);//[4000, 260, 100, 40, 10, 5]
		
		//Note: Sort() is used only from collections class, 
		//-------------------Declaring array and adding values
		int test[]= {23,2,45,100,1,900};
		//Printing array
		System.out.println(test);//[I@6d06d69c
		System.out.println(Arrays.toString(test));//[23, 2, 45, 100, 1, 900]
		
		//sorting , using Arrays.sort
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));//[1, 2, 23, 45, 100, 900]
	
	//-------------------
		ArrayList<String> myList=new ArrayList<String>(Collections.nCopies(10, "Samsung"));
		System.out.println(myList.size());//10
		System.out.println(myList);//[Samsung, Samsung, Samsung, Samsung, Samsung, Samsung, Samsung, Samsung, Samsung, Samsung]
	}

}
