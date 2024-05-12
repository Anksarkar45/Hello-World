package JavaPracticalNaveen;

public class LoopsConcept {

	public static void main(String[] args) {
// TODO Auto-generated method stub
        
		//1 to 100
		//while loop
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);// 1 to 10
			i++;
			//i=i+1;
			//++i;
			
		}
		
		//--------------
		int k=1;
		while(true)
		{
			System.out.println("Welcome toHotel Taj"); //Prints Welcome to Taj 5 times
			if(k==5)
			{
				break;
			}
			k++;
		}
		
		//for loop
		//print 1 to 10
		//for(initialisation;condition;increment/decrement)
		
		int j=1;
		for(;j<=10;)
		{
			System.out.println(j);
		    j++;
		}
		//-----------------------------
		
		int c=1;
		for(;true;)
		{
			System.out.println("Welcome to naveen"); //prints welcome to navven 5 times
			if(c==5)
			{
				break;
			}
			c++;
		}
		
		//--------------------------------
		
		int p;
		for(p=1;p<=5;p++)
		{
			System.out.println(p);
		}
		//---------------------
		//prints (a to z) with ASCII values
		
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch+"="+(byte) ch);// a=97 to z=122
		}
		
		//---------------
		byte b='a';
		System.out.println(b);//97
		
		//other data types allowed: double, float, int, short, byte, long, char
		
		for(double d=1.1;d<=5.1;d++)
		{
			System.out.println(d);
		}
		//------------------------------
		
		for(int w=1;w<=100;w++)
		{
			if(w%2==0)
			{
				System.out.println(w);//Prints all even numbers from 2 to 100
			}
		}
	

//--------------------------



int e=1;
do {
	//e++;
	System.out.println(e);
	e++;
	//break;
}
while(e<=10);

}
}


//--while loop:
//when number of iterations not fixed use while loop
//total links on page
//web table pagination

//---for loop
//number of iterations fixed
//carray , arraylist,
//excel ,file

//---do while
//web table pagination, to check if element is alreay present in the table 
//first it checks whether element is present , then we start the loop   
