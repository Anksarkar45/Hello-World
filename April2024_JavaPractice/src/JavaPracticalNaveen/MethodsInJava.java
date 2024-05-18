//method are factory- where common logic is stored-- applicable for all users
//Methods are independently written, we cannot write one method inside anothere method--
//my peace is imp-- my indepenedent-- my understanding--my survival matters, my parents, my health, my words matter, my mindfullness
//for non static create object
//one method can have multiple users
//multiple users , can call same method- multiple times

/*
1. yoga -- meditation - tratak- read- write - listen - act- self inwards change--- connect to nature
2.satvic food and lifestyle
3.listen to mom and walkaway from all others
4.my work- financial- self survival--project work, interview preparation, real time individual contributor practice
5.diary and journal and gratitude, and manjunath sir and books and self

//self accountable
//self responsible
//universe and divine support
//take sportively not personally for words and actions of others

//Listen to self choosen mentors
 //set an example of good for self
.house responsibilities
//hum jeetenge
 /*Time - attention -- thought-- attraction- visualistion self-- words i use--- choice i make 
 -- self change within-- not others-- stop expect-- start learning and managing self
 //do deep work in my skills and deliverables
  
*/
package JavaPracticalNaveen;

public class MethodsInJava {

	//1.no input , no return
	//void--no return-- function cannot return anything
	public void test()
    {
		System.out.println("test method");
		int i=10;
		System.out.println(i);
    }
	
	//2.no input, some return (returning via variable)
	//return type int
	public int totalAmount()
	{
		System.out.println("Total tax Amount....");
		int i=10;
		int tax=5;
		int finalPayment=i+tax;
		return finalPayment;
	}
	
	//no input some return
	public String trainerName()
	{
		System.out.println();
		System.out.println("trainer name");
		String name="NaveenLabs";
		return name;
	}
	
	//no input some return
	public char getGender()
	{
		System.out.println("get gender");
		char c='a';
		return c;
	}
	
	//some input, some return
	public int add(int a,int b)
	{
		System.out.println("adding two numbers ");
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args)
	{
		//To acess non-static methods create object of the clas
		MethodsInJava mvj=new MethodsInJava();
		
		//---------------------
	    mvj.test();
	    
	    //--------------------------------------
	    int val=mvj.totalAmount();
	    System.out.println(val);
	    //----------------------------------
	    String tr=mvj.trainerName();//trainer name
	    
	    //---------------------------------
	    System.out.println(tr);//Naveen Labs
	    
	    if(tr.equals("NaveenLabs"))
	    {
	    	System.out.println("Naveen Automation Labs");
	    }
	    
	    //---------------------------------
	    	System.out.println(mvj.getGender());
	    	char t=mvj.getGender();
	    	System.out.println(t);
	    	System.out.println((byte)t);//97
	  //-------------------------------------
    	int s1=mvj.add(10, 20);
    	System.out.println(s1);
    	
    	int s2=mvj.add(30,40);
    	System.out.println(s2-5);//65
	}
}

/*
//Tips for writing method
Return and void cannot be together
void function means, that function does not return anything
What a method return - store inside a variable of the same datatype- as mentioned in function
Whenever we write a method, return should be last statement
*/