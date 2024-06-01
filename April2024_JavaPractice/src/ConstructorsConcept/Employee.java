package ConstructorsConcept;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee {

	String name;
	int age;
	double salary;
	
	public Employee()//0 param
	{
		System.out.println("default const...");
	}
	
	public Employee(int i)//1 param const
	{
		System.out.println("1 param const..." +i);
	}
	
	public Employee(int i,String p)//2 params 
	{
		System.out.println("2 params const"+i+p);
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
        System.out.println("hello world");
        Employee obj=new Employee();
        obj.name="tom";
        obj.age=20;
        obj.salary=12.33;
        
        Employee obj1=new Employee(10);
        Employee obj2=new Employee(20,"Testing");
	}

}
/*
output
------
hello world
default const...
1 param const...10
2 params const20Testing
*/