package org.example.aaa.invocation;

import org.example.Creational.Singleton.TheSingleton;

public class AnInvoker4Singleton {

	public static void run() {
		
		 var s = TheSingleton.getInstance();
		 var s1 = TheSingleton.getInstance();
		 var s2 = TheSingleton.getInstance();
		 
		 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(s2);
		 
		 System.out.println("Observe that all three instances of the singleton are the same");
		 System.out.println("change a value in one instance, and observe how all instances change, because they are really all the same instance");
		 
		 s.setMyNumber(10);
		 s.setMyString("Ten");
		 
		 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(s2);


	}

}
