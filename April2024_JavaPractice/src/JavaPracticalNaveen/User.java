package JavaPracticalNaveen;

public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args)
	{
		//---------------------------------
		//Object declaration u1
      User u1=new User();
      
      //Assigning values to class variables , using u1 object
      u1.name="Riya";
      u1.age=30;
      u1.city="Pune";
      
      //Printing values of class variables ---- using u1 object
      System.out.println(u1.name+" "+u1.age+" "+u1.city); //Riya 30 Pune
      
      //------------------------------------------
      //Object declaration u2
      User u2=new User();
      
      //Assigning values to class variables-- using u2 object
      u2.name="Abhi";
      u2.age=35;
      u2.city="LA";
      
      //Printing values of class variables ---- using u2 object
      System.out.println(u2.name+" "+u2.age+" "+u2.city);//Abhi 35 LA
      //--------------------------
      //Object declaration u3
      User u3=new User();
      
      //Assigning class variables  values , using object u3
      
      u3.name="Geeta";
      u3.age=20;
      u3.city="Bangalore";
      
      //Printing value of class varible - using u3
      System.out.println(u3.name+" "+u3.age+" "+u3.city);//Geeta 20 Bangalore
      
      //----------------------------------------------
      //Reassigning values between u1, u2, u3
      System.out.println(u1.name+" "+u1.age+" "+u1.city);//Riya 30 Pune
      System.out.println(u2.name+" "+u2.age+" "+u2.city);//Abhi 35 LA
      System.out.println(u3.name+" "+u3.age+" "+u3.city);//Geeta 20 Bangalore
      
      System.out.println("-----------------------");
      u1=u2;
      System.out.println(u1.name+" "+u1.age+" "+u1.city);//Abhi 35 LA
      System.out.println(u2.name+" "+u2.age+" "+u2.city);//Abhi 35 LA
      System.out.println(u3.name+" "+u3.age+" "+u3.city);//Geeta 20 Bangalore

      System.out.println("-------------------------");
      u2=u3;
      System.out.println(u1.name+" "+u1.age+" "+u1.city);//Abhi 35 LA
      System.out.println(u2.name+" "+u2.age+" "+u2.city);//Geeta 20 Bangalore
      System.out.println(u3.name+" "+u3.age+" "+u3.city);//Geeta 20 Bangalore

      System.out.println("-------------------------");
      u3=u1;
      System.out.println(u1.name+" "+u1.age+" "+u1.city);//Abhi 35 LA
      System.out.println(u2.name+" "+u2.age+" "+u2.city);//Geeta 20 Bangalore
      System.out.println(u3.name+" "+u3.age+" "+u3.city);//Abhi 35 LA
	}

}


















//slow , calm, point to point 
//What you did this week ---
//What is ur progress
//naukri -- stable -- survival