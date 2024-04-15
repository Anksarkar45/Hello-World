package JavaPracticalNaveen;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println(a+b);//30
		
		//when integers are concatecatenated addition happens
				//when strings are concatenated they are joined
				//when integer and string concatecated,they are joined
		String x="hello";
		String y="Selenium";

		System.out.println(x+y);//helloSelenium
		System.out.println(a+x);//10hello
		System.out.println(a+b+x+y);//30helloSelenium
		System.out.println(x+y+a+b);//helloSelenium1020
		
		//Always brackets given first preference
		System.out.println(x+y+(a+b));//helloSelenium30
		
		double c=12.33;
		double d=23.44;
		System.out.println(x+y+c+d);//helloSelenium12.3323.44
		
		char g='m';
		char p='n';
		String l="testing";
		String u="automation";
		System.out.println(l+u);//testingautomation
		System.out.println(l+u+g+p);//testingautomationmn
		
		//concatenation with characters
		char t1='a';
		char t2='b';
		
		System.out.println(t1);//a
		System.out.println(t2);//b
		System.out.println(t1+t2);//a+b->97+98->195
		System.out.println(t2-t1);//1
		System.out.println('a'+'b');//195
		char t3='z';
		System.out.println(t1+t2+t3);//a+b+c-> 97+98+122-->317
		
		char gender='m';
		System.out.println();
	}

}

//arithmetic operation performed when both values atre numbers
