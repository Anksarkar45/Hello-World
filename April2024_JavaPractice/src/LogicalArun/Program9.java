//Checking whether character is vowel or not
package LogicalArun;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any character");
		char c=scanner.next().charAt(0);
		boolean isVowel=false;
		
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': 
			isVowel=true;
		}
		if(isVowel==true)
		{
			System.out.println(c+"is a vowel");
		}
		else
		{
			System.out.println(c+"is not vowel");
		}
		scanner.close();

		
	}

}
/*
Enter any character
g
gis not vowel

Enter any character
G
Gis not vowel

Enter any character
a
ais a vowel

Enter any character
A
Ais a vowel
*/

