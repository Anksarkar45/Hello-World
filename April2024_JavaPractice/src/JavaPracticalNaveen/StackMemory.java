package JavaPracticalNaveen;

public class StackMemory {
	//static --- non static (object creation needed)
	//non static --- non static (no object )
	//static--- static (no object)
    //non-static ----static(no object)
	//heap-- all objects stored
	//cma-- all static members stored
	//stack ---all properties follow LIFO-- execution time-- allocation and de-allocation----once full throws <Stack overflow error> 
	
	public static void t1()
	{
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2()
	{
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3()
	{
		System.out.println("t3 method");
		//m1();--- error (static -- non static--- create object)
		
		StackMemory o2=new StackMemory();
		o2.m1();
	}
	
	
	public void m1()
	{
		System.out.println("m1 method");
	    int i=10;
		m2();
		
	}
	public void m2()
	{
		System.out.println("m2 method");
		int p=20;
		m3();
	}
public void m3()
{
	System.out.println("m3 method");
    StackMemory.t1();
	//m1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	m2();//Cannot make a static reference to the non-static method m2() from the type StackMemory
	
		StackMemory obj=new StackMemory();
		obj.m1();
		obj.m2();
	}

}











//dont  argue with anyone
//dont react
//stay calm and focussed on my work
//stay away from all relatives
//be independent,, positive in self reflection,, be selfish, be money independent 