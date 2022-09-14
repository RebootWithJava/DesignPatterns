package org.example.aaa.invocation;


import org.example.Behavioral.Iterator.Java.ContainedElement;
import org.example.Behavioral.Iterator.Java.ElementContainer;

public class AnInvoker4BehavioralIteratorJava 
{
	public static void run()
	{
	    ElementContainer container = new ElementContainer();
	    
	    var empty = container.iterator();
	    System.out.println("********************  Call hasNext() and Next() on Empty container ");
	    System.out.print("empty.hasNext returns: ");
	    System.out.println(empty.hasNext());
	    System.out.print("empty.next()  returns: ");
	    System.out.println(empty.next());
	    System.out.println("********************  Call hasNext() and Next() (again) on Empty container ");
	    System.out.print("empty.hasNext returns: ");
	    System.out.println(empty.hasNext());

	    System.out.print("empty.next()  returns: ");
	    System.out.println(empty.next());
	    
	    System.out.println("********************  Populate the container");
	    
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
	
	    System.out.println("********************  Get a new iterater on the container");
	    
	    empty = container.iterator();
	    System.out.println("********************  Call hasNext() and Next() on populated container ");	    
	    System.out.print("empty.hasNext returns: ");
	    System.out.println(empty.hasNext());
	    System.out.print("empty.next()  returns: ");
	    System.out.println(empty.next());
	    System.out.print("empty.hasNext returns: ");
	    System.out.println(empty.hasNext());
	    System.out.print("empty.next()  returns: ");
	    System.out.println(empty.next());
	
	    
	    System.out.println("********************  invoke for(var x: container)  [creating a new iterator]");
	    
	    for (var x : container )
	    {
	    	System.out.println(x);
	    }
	}
}
