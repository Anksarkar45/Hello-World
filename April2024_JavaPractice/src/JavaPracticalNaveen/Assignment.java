package JavaPracticalNaveen;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=a++ + ++a * --a - a--;
		System.out.println(b);//5
		
		//----------------------------------
		
		int m=0, n=0;
		int p=--m * --n * n-- * m--;
		System.out.println(p);//1
		System.out.println(m);//-2
		System.out.println(n);//-2
		
		//------------------
		int i=19,j=29;
        int k=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.println("i=" +i);//19
        System.out.println("j=" +j);//29
        System.out.println("k=" +k);//-20
        
        char t='A';
        System.out.println((int)++t);//66
        
        int num=0;
        if(num>=0)
        {
        	System.out.println("+ve");
        }
        else
        {
        	System.out.println("-ve");
        }
        
        int test=0;
        if(test%2==0)
        {
        	System.out.println(test+ ":even number");
        }
        else
        {
        	System.out.println(test + ": odd number");
        }
        
	}
}

/*
output
-------------

5
1
-2
-2
i=19
j=29
k=-20
66
+ve
0:even number


 3...
 */
