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

	//UniqueIndividual method of BMW
	//@Override--  error because, we cannot override individual methods of child class
	public void autoParking()	
	{
		System.out.println("BMW--- autoParking");
		
	}
	
	//Individual method of BMW-- but same method is there in sibling
	public void theftSafety()
	{
		System.out.println("BMW----theftSafety");
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
*/