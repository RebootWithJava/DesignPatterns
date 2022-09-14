package org.example.aaa.invocation;

import org.example.Structural.Composite.LeavesAsNodes.Employee;


public class AnInvoker4CompositeLeavesAsNodes {

	public static void run() {

		System.out.println("************************************** Initialize the entire collection");

		// create the CEO, who is both an employee and a collection of employees    
		Employee ceo = new Employee("CEO","Company", 2000,1000);
		    
		
		// create the managers, who are both employees and collections of employees
		Employee hrhead = new Employee("hrhead","HR",1500,750);  
		Employee marketinghead = new Employee("marketinghead","marketing", 1500,750);	
		Employee engineeringhead = new Employee("engineeringhead","engineering",1500,750);	
		Employee traininghead = new Employee("traininghead","training",1500,750);	
		Employee developmenthead = new Employee("developmenthead","development",1500,750);	
		
		// Add the managers to the CEO  (not to a company node!)
		ceo.add(hrhead);
		ceo.add(marketinghead);
		ceo.add(engineeringhead);
		ceo.add(traininghead);
		ceo.add(developmenthead);
		
		
		 // create each employee and add them to their manager   
		    Employee hr1 = new Employee("hr1","HR",1000,500);										hrhead.add(hr1);
		    Employee hr2 = new Employee("hr2","HR",1000,500);										hrhead.add(hr2);
		    
		    Employee m1  = new Employee("m1","marketing",1000,500);									marketinghead.add(m1);
		    Employee m2  = new Employee("m2","marketing",1000,500);									marketinghead.add(m2);
		    Employee m3  = new Employee("m3","marketing",1000,500);									marketinghead.add(m3);
		    
		    Employee e1  = new Employee("e1","engineering",1000,500);								engineeringhead.add(e1);
		    Employee e2  = new Employee("e2","engineering",1000,500);								engineeringhead.add(e2);
		    Employee e3  = new Employee("e3","engineering",1000,500);								engineeringhead.add(e3);
		    Employee e4  = new Employee("e4","engineering",1000,500);								engineeringhead.add(e4);
		    
		    Employee t1  = new Employee("t1","training",1000,500);									traininghead.add(t1);
		    Employee t2  = new Employee("t2","training",1000,500);									traininghead.add(t2);
		    Employee t3  = new Employee("t3","training",1000,500);									traininghead.add(t3);
		    Employee t4  = new Employee("t4","training",1000,500);									traininghead.add(t4);
		    
		    Employee d1  = new Employee("d1","development",1000,500);								developmenthead.add(d1);
		    Employee d2  = new Employee("d2","development",1000,500);								developmenthead.add(d2);
		    Employee d3  = new Employee("d3","development",1000,500);								developmenthead.add(d3);
		    Employee d4  = new Employee("d4","development",1000,500);								developmenthead.add(d4);
		    Employee d5  = new Employee("d5","development",1000,500);								developmenthead.add(d5);
		    Employee d6  = new Employee("d6","development",1000,500);								developmenthead.add(d6);
			    
		    System.out.println("************************************** manipulate individual employee nodes, non recursively");
		    ceo.printPaycheck();
		    hrhead.printPaycheck();
		   
		    System.out.println("************************************** start at the CEO, recursively");
		    ceo.printPaycheck(true);
		    
		    

	}

}
