package JavaPracticalNaveen;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//Use default class-- ArrayList
		//create an object of ArrayList
		
		ArrayList ar=new ArrayList();
        System.out.println(ar.size());//output =0//internally -->pc=0 , vc=0
        
        //insertingh elements inside dynamic array-- using add method
        ar.add(100);
        System.out.println(ar.size());//1
        
        ar.add(200);
        ar.add(300);
        System.out.println(ar.size());//3
	
        //FetchingElements from dynamic array--- using <refVar.get(index_position)>
        System.out.println(ar.get(0));//100
        System.out.println(ar.get(1));//200
        System.out.println(ar.get(2));//300
        
        //Fetching index which is greater than array size-- output: IndexOutOfBoundExceptioon
        //System.out.println(ar.get(3)); --- index out of Bound Exception
        //System.out.println(ar.get(4));
	    
        //updating the array elements inside dynamic array --- using <refVar.add(newValue)>
        ar.add(600);
        ar.add(700);
        ar.add(800);
        ar.add(900);
        
        //Printing array size after adding the elements -- using size()
        System.out.println(ar.size());//7
        
        //Fetching elelment of dynamic array at specific index position:   use- <refVar.get(index)>
        System.out.println(ar.get(5));//800
        
        //Adding heterogeneous values inside dynamic array
        
        ar.add(12.33);
        ar.add(true);
        ar.add('m');
        ar.add("testing");
        System.out.println(ar.size());//11
        
        //Declaring ArrayList using  generics (for Integer values) concept
        ArrayList<Integer> marksList=new ArrayList<Integer>();
        marksList.add(1000);
        marksList.add(2000);
        marksList.add(6000);
        
        //-------------Checking the error - by adding decimal value inside  ArrayList-Integer generics
        //marksList.add(30.0);//Unresolved compilation problem
        //The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (double)
	
        //---------Rechecking arrayList size --- using size()
        System.out.println(marksList.size());//3
	
        
        //----Checking the error by Fetching index position value -- beyond size -- for dynamic arraylist
        //System.out.println(marksList.get(5));//Index out of bound exception
        
        //System.out.println(marksList.get(5));//IndexOutOfboundException
	    
        //----------- Declaring arrayList with double generics
        ArrayList<Double> bmiList=new ArrayList<Double>();
        System.out.println(bmiList.size());//0
        
        //inserting elements
        bmiList.add(12.33);
        bmiList.add(100.00);
        System.out.println(bmiList.size());//2
        
        //----- declaring arraylist with string generics
        ArrayList <String> browserList=new ArrayList<String>();
        
        //Inserting elements
        browserList.add("chrome");
        browserList.add("firefox");
        browserList.add("safari");
        browserList.add("opera");
        System.out.println(browserList.size());//4
        
        //Fetching elements from array , based on index position
        //System.out.println(browserList.get(1));//firefox
        //System.out.println(browserList.get(5));//ArrayIndexOutOfBoundException
        
        //Printing dynamic arrayList statement directly using S.O.P statement - without using for loop
        System.out.println(browserList);//[chrome, firefox, safari, opera]
        
        //Printing array elements , using for-loop
        for(int i=0;i<browserList.size();i++)
        {
        	System.out.println(browserList.get(i));//chrome,firefox,safari,opera
        	
        	if(browserList.get(i).equals("firefox"))
        	{
        		System.out.println("mozilla");
        		break;
        	}
        }
        System.out.println("-------------");
        
        //printing array elements using -for each loop
        for(String e:browserList)
        {
        	System.out.println(e);//chrome,firefox,safari,opera
        }        	
        
        System.out.println("---------------");
        
        //Declaring Object array ,adding heterogenous elements and printing elements using for-each loop 
	      
        ArrayList<Object> empInfoList =new ArrayList<Object>();
        
        //Size of arrayList
        System.out.println(empInfoList.size());//0
        
        //Adding elements
        empInfoList.add("Emp_FirstName: Riya");
        empInfoList.add("Emp_LastName:Sinha");
        empInfoList.add("Emp_Age"+30);
        empInfoList.add(45.55);
        empInfoList.add("Emp_Place:Bangalore");
        empInfoList.add("Gender: Female");
        
        //Size of arrayList
        System.out.println(empInfoList.size());//6
        
        //Printing array elemnts using for-each loop
        for(Object e:empInfoList)
        {
        	System.out.println(e);
        }
        
        System.out.println("---------------------------");
        
        //Printing array elements directly
        System.out.println(empInfoList);
	
	//Declaring arraylist elements for integer generics
        
        ArrayList <Integer> numbers=new ArrayList<Integer>();
        //adding
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        
        //printing array elemnts
        System.out.println(numbers);//[100 200 300]
        
        //printing elemnts using for-each loop
        for(Integer e:numbers)
        {
        	System.out.println(e);//100 200 300
        }
	}

}

//be in present --- survive


//saving--- pigmy or fd
//everlearning income--
//money saving, earning, investing
//talk sensible
//time management
//update skils and proove what i amm contributoing value to the company , survive
//dont react 
//dont take anyone words personally
//khaun peeun -- aaram-- sukhi
//observe and learn
//dont ask -
//speak in points


//---------------------
/*
0
1
3
100
200
300
7
800
11
3
0
2
4
[chrome, firefox, safari, opera]
chrome
firefox
mozilla
-------------
chrome
firefox
safari
opera
---------------
0
6
Emp_FirstName: Riya
Emp_LastName:Sinha
Emp_Age30
45.55
Emp_Place:Bangalore
Gender: Female
---------------------------
[Emp_FirstName: Riya, Emp_LastName:Sinha, Emp_Age30, 45.55, Emp_Place:Bangalore, Gender: Female]
[100, 200, 300]
100
200
300
*/

