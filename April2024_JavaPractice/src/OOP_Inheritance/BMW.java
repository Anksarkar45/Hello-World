package OOP_Inheritance;

//BMW class is-a child1 of parent car- class, (use extend keyword)
//BMW is extending Car, but reverese not true
//BMW is not EXTENDING Truck- MULTIPLE INHERITANCE not allowed in classes- else it will lead to DIAMON PROBLEM

public class BMW extends Car{

	//start() is overriden method of BMW from Car -class, where we use @Override annotation to represent method overriding properties
	//method overriding decision happens at run-time-- this process also called "Run-time-polymorphism"
	
	
	//OVERRIDEN METHOD from parent class(CAR)
	@Override
	public void start()
	{
		System.out.println("BMW-- start");
		System.out.println("BMW-- start");
		System.out.println("BMW-- start");
	}
	
	//OVERRIDEN METHOD from GRANDparent class(Vehicle)
	@Override
	public void petrolEngine()
	{
		System.out.println("BMW-- petrol engine");
	}
	
	
	/*-----------------------------------------------------------
	//Overriding of final method is NOT allowed in java
	@Override
	public final void service()
	{
		System.out.println("BMW service");
	}
    -----------------------------------------------------------

	//overrding of static method is NOT allowed in java
	@Override
   public static void billing()
   {
	   System.out.println("BMW-- billing");
   }
	
	Note: If we remove@Override annotation then it becomes individual static method of BMW, which is allowed in java
	Eg: service() written below 
	-----------------------------------------------------------------------------------------------------------------
	*/
	

	
	
	//UniqueIndividual method of BMW
	//@Override--  error because, we cannot override individual methods of child class
	public void autoParking()	
	{
		System.out.println("BMW--- autoParking");
		
	}
	
	//Individual(non overriden, non static) method of BMW-- but same method is there in sibling
	public void theftSafety()
	{
		System.out.println("BMW----theftSafety");
	}
	
	// individual(non-overriden, static method) of BMW-- but same method name is there in parent class
	
	public static void billing()
	{
		System.out.println("BMW-- billing");
	}
	
	/*overriding of private methods is not allowed in java
	@Override
	private void pickcolor()
	{
		System.out.println("BMW-- pickcolor");
	}
	*/
	
	//Individual private method of child class --- same name method in parent class 
	private void pickcolor()
	{
		System.out.println("BMW-- pickcolor");
	}
}

/*
---- notes----
Defination:
	Method Overriding 
When we have method in parent class and same method inside child class 
1. with same method name 
2.with same number of method parameter
3.with exact same return type 
4.with same business logic/different business logic--(same business logic does not matter in method overriding)		
5.method signature should be exactly same inside parent and class , in method overriding
6.with same sequence of parameter and with exact same data inside the method parameter

Note: 
1.in method overriding decision is taken by interpreter at run time , which method to call(parent class method or child class method)
2.In method overriding child class methods are given first preference
3.In method overriding- Inheritance mandatory

Note <Differences between method overloading and method overrding>
1.In METHOD OVERLOADING - decision is taken by compiler which method to execute , as soon as we create objct- within same class
2.In method overloading , inheritance is not mandatory

Note: 
1.Child class can override method from its immediate parent class- provided it has to be inherited mandatorily
2.Child class can override method from its grand parent class-- provided it has to be inherited mandatorily
3.Child1 class(BMW) cannot override from child2(Audi) class(i.e Siblings cannot inherit)
4.Child1 class(BMW) cannot override from another child2(Audi) (i.e siblings cannot override)
5.Child1 class(BMW) and child2(Audi) class can have same name - for their respective individual methods(Eg: autoParking)
Note:
If method is not overriden inside child class, then that method becomes either individual method of child class or inherited method of child class
MULTI-LEVEL INHERITNCE isallowed in java via classes(Leve1 , level 2, level 3)
MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA via classes, it gives DIAMON PROBLEM(one child class cannot have multiple parent class)  

Note:
--Static methods---(Also called:METHOD HIDING CONCEPT)
Static methods cannot be overriden- in parent child classes
We can have separate individual static methods(with same name) in parent and child classes

Note:
static methods can be overloaded - withing same class 
final methods can be overloaded-- within same same
private methods can be overloaded-- within same same
Eg:Refer: static main method 

Note:
--Final method---
final methods cannot be overriden inside child class from parent class
We can have separate individual final methods(with same name) in parent class and child class

Note:
--private method---
private methods cannot be overriden inside child class from parent class
We can have separate individual private methods(with same name) in parent class and child class

Note:Multi-Level inheritance
(level 1 , level2 , level 3....)
Multi-level inheritance is possible in java via classes
Multi-level inheritance is possible in java via interface-- but not recomended because interface no business logic can be written

Note: Multiple Inheritance
Multiple Inheritance is not possible in java via classes(once child class cannot have multiple parent class)-- it leads to Diamon problem
Multiple Inheritance is possible in java via interfaces(one child interface, can have multiple parent interfaces)
To Overcome Diamod problem, we use Interfaces, instead of classes
*/