//Strings are immutable means "Value of string literals" cannot be changes /modified
package StringManipulation;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
        String t = s + "Hello";
		System.out.println(t);//SeleniumHello
		System.out.println(s);//Selenium
        /*
		output
		-----------
		SeleniumHello
		Selenium
		*/
		//----------------------------
		String st="Java";
		System.out.println(st+"Python");//JavaPython-- (no) reference
		System.out.println(st);//Java --- (st) reference 
		st=st+"Automation";
		System.out.println(st);//Java Automation
        String u="Java";
        /*
         * output
         ----------
        JavaPython
        Java
        JavaAutomation
	  */
        //-------------------------------
        //mutable classes:
        //StringBuilder(1.5)--faster
        //StringBuffer(1.0)---slower
        
        StringBuilder sb=new StringBuilder("Testing");
        System.out.println(sb);
        sb.append("Automation");
        System.out.println(sb);
        
        String pop="	submit	";
        pop=pop.trim();
        System.out.println(pop);
	}

}
