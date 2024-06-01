package JavaPracticalNaveen;

public class StaticMethodOverloading {

	//static method can be overloaded
	public static void login()
	{
		int []i;
	}
	
	public static void login(int i)
	{
		
	}
	public static void login(int i,int j)
	{
		
	}
	//-------------------------------
	public void main(int a,double b)
	{
		System.out.println("main method"+a+b);
	}
	
	public static void main(int a)
	{
		System.out.println("main method:"+a);
	}
	
	public static void main(int a[])
	{
		System.out.println("main method"+a);
	}
	
	public static void main(String a[],int b)
	{
	  System.out.println("main method"+a);	
	}
	
	public static void main()
	{
		System.out.println("main method without any value");
	}
	
	public static void main(int a,int b)
	{
		System.out.println("main method"+a+b);
	}
	
	public static void main(String naveen[]) {
		// TODO Auto-generated method stub
  
		System.out.println("main method");
		
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(20,30);
		
		StaticMethodOverloading obj=new StaticMethodOverloading();
		obj.main(10,12.33);
	}

}

/*
output
----------
main method
main method:10
main method2030
main method1012.33
*/