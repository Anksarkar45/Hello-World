package JavaPracticalNaveen;

public class Order {

	public int getOrder(String customerName,int price,int tax)
	{
		//businesslogic
		
		//note : all input parameters, must be utilised
		System.out.println(customerName);
		int k=price+tax;
		return k;
	}
	
	public int getOrder(String customerName,int price)
	{
		System.out.println(customerName);
		int k=price;
		return k;
	}
	public static void main(String[] args) 
	{
	Order obj=new Order();
	//utilising the over-loaded method , with 3 parameters
	int p=obj.getOrder("Deepa", 1000,30);
	System.out.println(p);
	
	//utilising the over loaded method , with 2 parameters
	int f=obj.getOrder("Naveen", 4000);
	System.out.println(f);
		

	}

}

/*
Deepa
1030
Naveen
4000

 */