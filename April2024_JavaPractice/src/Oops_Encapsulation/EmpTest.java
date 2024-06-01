//Corresponding -- encapsulated class is : Employee.java
package Oops_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		//Encapsulation is similar to API- testing, that follow CRUD principles
		
		//POST-Create
		Employee e1=new Employee("AArush",25,12.55,"Pune","India");
		
		//GET() -- Retrieve
		System.out.println(e1.getName());//Aarush
		System.out.println(e1.getAge());//25
		System.out.println(e1.getCity());//Pune
		System.out.println(e1.getCountry());//India
		System.out.println(e1.getSalary());//12.55
		
		System.out.println("=====================");
		
		//PUT()----updation
		e1.setName("Anil");
		e1.setAge(30);
		e1.setCity("Bengaluru");
		e1.setCountry("America");
		e1.setSalary(52.33);

		//After updating -- retrieving the updated values on the console
		System.out.println(e1.getName());//Anil
		System.out.println(e1.getAge());//30
		System.out.println(e1.getCity());//Bengaluru
		System.out.println(e1.getCountry());//America
		System.out.println(e1.getSalary());//52.33

	}

}
