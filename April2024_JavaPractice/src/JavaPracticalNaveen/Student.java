package JavaPracticalNaveen;

public class Student {

	public int getStudentMarks(String studentName)
	{
		System.out.println("getting marks for: "+studentName);
	 
		int marks=-1;
		
		if(studentName.equalsIgnoreCase("Riya"))
		{
			marks=90;
		}
		else
			if(studentName.equalsIgnoreCase("Vikash"))
		{
			marks=100;
		}
			else
				if(studentName.equalsIgnoreCase("Neetu"))
				{
					marks=80;
				}
				else
					if(studentName.equalsIgnoreCase("Naveen"))
					{
						marks= 10;
					}
					else
					{
						System.out.println("no student found...please pass the right student name...."+studentName);
					}
		return marks;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		int m1=s1.getStudentMarks("Riya"); 
		System.out.println(m1);//90
		
		int m2=s1.getStudentMarks("Naveen");
        System.out.println(m2+60);
		
        if(m2>=0)
        {
        	System.out.println("print the marks sheet");
        }
        
        int m3=s1.getStudentMarks("Tom");
        System.out.println(m3);
        
        if(m3>=0)
        {
          System.out.println("print the marks sheet");	
        }
        
        int m4=s1.getStudentMarks("Peter");
        System.out.println(m4);
	}

}
/*
output
-----------------

getting marks for: Riya
90
getting marks for: Naveen
70
print the marks sheet
getting marks for: Tom
no student found...please pass the right student name....Tom
-1
getting marks for: Peter
no student found...please pass the right student name....Peter
-1

*/