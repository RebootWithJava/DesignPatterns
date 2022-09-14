package org.example.aaa.invocation;

import org.example.Behavioral.Iterator.NET.ContainedElement;
import org.example.Behavioral.Iterator.NET.ElementContainer;



	public class AnInvoker4BehavioralIteratorNET
	{
		public static void run()
		{
		    ElementContainer container = new ElementContainer();
		    
		    System.out.println("********************  Call get current before Next() on Empty container ");
		    var empty = container.getEnumerator();
		    System.out.print("empty.getCurrent returns: ");
		    System.out.println(empty.getCurrent());
		    System.out.print("empty.Next()     returns: ");
		    System.out.println(empty.Next());
		    
		    System.out.println("*******************  Populate the container");
		    
		    container.AddElement(new ContainedElement("AK","Alaska",0,99999999,0));
		    container.AddElement(new ContainedElement("AL","Alabama",0,500,.02));
		    container.AddElement(new ContainedElement("AL","Alabama",500,3000,.04));
		    container.AddElement(new ContainedElement("AL","Alabama",3000,99999999,.05));
		    container.AddElement(new ContainedElement("AR","Arkansas",0,4000,.02));
		    container.AddElement(new ContainedElement("AR","Arkansas",4000,8000,.04));
		    container.AddElement(new ContainedElement("AR","Arkansas",8000,79300,.059));
		    container.AddElement(new ContainedElement("AR","Arkansas",79300,99999999,.066));
		    container.AddElement(new ContainedElement("AZ","Arizona",0,26500,.0259));
		    container.AddElement(new ContainedElement("AZ","Arizona",26500,53000,.0334));
		    container.AddElement(new ContainedElement("AZ","Arizona",53000,159000,.0417));
		    container.AddElement(new ContainedElement("AZ","Arizona",159000,99999999,.045));
		    
            var enumerator = container.getEnumerator();
            
		    System.out.println("********************  Call get current before Next() on Populated container ");

		    System.out.print("enumerator.getCurrent returns: ");           
            System.out.println(enumerator.getCurrent());
            
            System.out.println("********************  Enumerate the container in a while loop");
            
            while(enumerator.Next())
            {
            	System.out.println(enumerator.getCurrent());
            	var y = enumerator.getCurrent();
            	System.out.println(y);
            	var z = enumerator.getCurrent();
            	System.out.println(z);
            }
            
            System.out.println("********************  Invoke getCurrent and Next() after finished");          
		    System.out.print("enumerator.getCurrent returns: ");
		    System.out.println(enumerator.getCurrent());
		    System.out.print("enumerator.Next()     returns: ");
		    System.out.println(enumerator.Next());

		}
	}

	

