package AccMod1;

public class BMW extends Car {

	public static void main(String[] args) {
		// creating object of BMW
		
		BMW b=new BMW();
		//acessing variables , from subclass , same package
		b.name;
		b.brand;
		b.price;
		b.milg; //private not acessible
		
		
	}

}
