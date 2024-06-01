
//Assignment--- Try same logic using string concdep---toCharArray Method
//Program to print city starting with "P"
package PracticePremnath;

public class oops_java_23_5_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]=new String[5];
			str[0]="Pune";
			str[1]="Mumbai";
			str[2]="Paris";
			str[3]="Hyd";
			str[4]="Parel";
			
			
			for(int i=0;i<str.length;i++)
			{
				//System.out.println(str[i]);
				
				if(str[i].startsWith("P"))
				
				{
					System.out.println(str[i]);
				}
			}
					
		

	}

}
