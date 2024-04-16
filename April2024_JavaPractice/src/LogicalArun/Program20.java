//Java program to find sum of all digits in the inputted number
package LogicalArun;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int sum=0;
		while(num!=0)
		{
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println("Sum of digits of inputted number is"+sum);

	}

}
/*
Sum of digits of inputted number is15
*/