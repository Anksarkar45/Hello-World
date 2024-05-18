package JavaPracticalNaveen;

public class EmployeeTest 
{
	String name;
	int age;
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void printMesg()
	{
		System.out.println("hello");
	}
	
	public void getEmpInfo(EmployeeTest t2)
	{
		t2.name="Tom";
		t2.age=20;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		EmployeeTest t1=new EmployeeTest();
		t1.add(20,30);
		
		t1.getEmpInfo(t1);
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.name="Riya";
		t1.age=30;
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.getEmpInfo(t1);
		System.out.println(t1.name);
		System.out.println(t1.age);

	}

}


/**
 * 50
Tom
20
Tom
20
Riya
30
Tom
20
Tom
20
 * /
 */