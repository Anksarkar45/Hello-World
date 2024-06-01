//withoutnmain-method
package Oops_Encapsulation;

public class Employee {

	//private class variables
	private String name;
	private int age;
	private double salary;
	private String city;
	private String country;
	//Important: Here public constructor and public methods are encapsulating private variables,and we are acessing them from outside of the class , hence following encapsulation principles 
	
	//constructor
	public Employee(String name,int age,double salary,String city,String country)
	{
		//name=name1; -- this also possible, but not readable
		this.name=name;
		this.age=age;
		this.salary=salary;
        this.city=city;
        this.country=country;
	 }

	//auto generated gettters and setters
	//How: Right Click>>Source>>Generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
//corresponding main class is "empTest"