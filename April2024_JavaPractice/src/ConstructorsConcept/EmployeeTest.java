package ConstructorsConcept;

public class EmployeeTest {
	
	String name;
	int age;
	double salary;
	//hidden constructor/default constructor
	
	public EmployeeTest(String name)
	{
		this.name=name;
	}
	
	public EmployeeTest(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public EmployeeTest(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeTest e1=new EmployeeTest("Tom");
		//updating value of name
		System.out.println(e1.name);//Tom
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//0.0
		
		//object e2
		EmployeeTest e2=new EmployeeTest("Abhi",25);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);//Abhi 25 0.0
		e2.salary=25.55;
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);//Abhi 25 25.55
		
		EmployeeTest e3=new EmployeeTest("Peter",30,10.22);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		
	}

}
//self dependent
//constrol emotions and self survive
//peace 
//solution and growth oriented
//money minded
//focus on self target -- not people,
//Time lost is time gone