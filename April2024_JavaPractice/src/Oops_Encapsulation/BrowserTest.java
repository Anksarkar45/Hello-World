//Corresponding class--Browser.java
package Oops_Encapsulation;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser br=new Browser();
		br.launchBrowser();
		//br.checkRAM();//error-- cannot acess private members-- hence encapsulation achieved
	}

}
/*
output
----------
launching browser
Check browser version....
check OS compatibility
check RAM
Check CPU
browser launched
*/