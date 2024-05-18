package JavaPracticalNaveen;

public class PolymorphismConcept {

	public void search()
	{
		
	}
	
	public void search(String productName)
	{
		System.out.println(productName);
	}
	
	public void search(String productName,int price)
	{
		System.out.println(productName+" "+price);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//compile time polymorphism 
		PolymorphismConcept obj=new PolymorphismConcept();
		//compile time polymorphism
		
		obj.search("macbook");
		obj.search("imac",1000);
	}

}
/*
 * macbook
imac 1000

 * */

/*
Notes:
-----------------
	Poly(many)+morphism(forms)
	method overloading is also called compile time polymorphism(static binding), where compiler has already taken decision,which method to be called, on the basis of method input parameter

-------------
Method overriding is called --Run Time polymorphism
*/