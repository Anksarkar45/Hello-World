package ConstructorsConcept;

public class Test {

	public static void main(String[] args) {
		// Acessing static properties of (Testing class)
		Testing.getInfo();
		
		// Acessing non-static private constructor of (Testing class)
		//Testing t1=new Testing();-- error , cannot acess, because constructor is declared private.

	}

}
