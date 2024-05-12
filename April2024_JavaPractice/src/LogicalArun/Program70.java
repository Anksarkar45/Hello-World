//Java program to print the number triangle pyramid
package LogicalArun;

public class Program70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

/*
output
-------
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 

-------------
*/