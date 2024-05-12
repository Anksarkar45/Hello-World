//Java pro

package LogicalArun;

public class Program69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) //printing rows
		{
			for(int j=0;j<5-i;j++) //printing spaces
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) //printing stars
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
//output
/*

-------------
   * 
  * * 
 * * * 
* * * * 
* * * * * 
--------------
*/