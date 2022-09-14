package org.example.aaa.invocation;

import org.example.Structural.Composite.LeavesAndNodes.Employee;
import org.example.Structural.Composite.LeavesAndNodes.EmployeeComposite;


public class AnInvoker4CompositeLeavesAndNodes 
{

	public static void run() throws Exception{

		System.out.println("************************************** Initialize the entire collection");
		// create individual collections for each department
		EmployeeComposite company = new EmployeeComposite("company");
		EmployeeComposite HR = new EmployeeComposite("HR");
		EmployeeComposite marketing = new EmployeeComposite("marketing");
		EmployeeComposite engineering = new EmployeeComposite("engineering");
		EmployeeComposite training = new EmployeeComposite("training");
		EmployeeComposite development = new EmployeeComposite("development");
		
	   
		// add the departments into the company
		company.add(HR);
		company.add(marketing);
		company.add(engineering);
		company.add(training);
		company.add(development);
		
		// Create an employee and add it to the company collection, and set it as the company manager
		Employee ceo = new Employee("CEO", 2000,1000); 								
		company.add(ceo);  
		company.setManager(ceo);	
		
		// Create an employee and add it to the HR collection, and set it as the HR manager
	    Employee hrhead = new Employee("hrhead",1500,750);							
	    HR.add(hrhead);
	    HR.setManager(hrhead);
	    
	    // create the other managers 
   	
	    Employee marketinghead = new Employee("marketinghead", 1500,750);	
	    Employee engineeringhead = new Employee("engineeringhead",1500,750);
	    Employee traininghead = new Employee("traininghead",1500,750);				
	    Employee developmenthead = new Employee("developmenthead",1500,750);
	    
	    
	    // add HR employees to the HR collection
	    Employee hr1 = new Employee("hr1",1000,500);								
	    HR.add(hr1);
	    Employee hr2 = new Employee("hr2",1000,500);								
	    HR.add(hr2);
	   	
	  
	    // create and add an employee to the marketing collection
		Employee m1  = new Employee("m1",1000,500);									
		marketing.add(m1);
		
		// add the previously created manager into the marketing collection (but not as the first employee)
		// and set them as the manager
		marketing.add(marketinghead);
		marketing.setManager(marketinghead);
		
		// create and add the other employees into the marketing collection
		Employee m2  = new Employee("m2",1000,500);									
		marketing.add(m2);
	    Employee m3  = new Employee("m3",1000,500);									
	    marketing.add(m3);
	    
	    
	    
	   
	    // create and add some employees into the engineering collection
	    Employee e1  = new Employee("e1",1000,500);									
	    engineering.add(e1);
	    Employee e2  = new Employee("e2",1000,500);									
	    engineering.add(e2);
    
	    // add the previously created manager into the engineering collection (but not as the first employee)
	 	// and set them as the manager
	    engineering.add(engineeringhead);
		engineering.setManager(engineeringhead);
		
		// create and add the other employees into the engineering collection
	    Employee e3  = new Employee("e3",1000,500);									
	    engineering.add(e3);
	    Employee e4  = new Employee("e4",1000,500);									
	    engineering.add(e4);
	    
	    
	    // create and add some employees into the training collection
	    Employee t1  = new Employee("t1",1000,500);									
	    training.add(t1);
	    Employee t2  = new Employee("t2",1000,500);									
	    training.add(t2);
	    Employee t3  = new Employee("t3",1000,500);									
	    training.add(t3);
	    
	    // add the previously created manager into the training collection (but not as the first employee)
	 	// and set them as the manager
	    training.add(traininghead);
		training.setManager(traininghead);
		
		// create and add the other employee into the training collection
	    Employee t4  = new Employee("t4",1000,500);									
	    training.add(t4);
	    
	    
	    // create and add some employees into the development collection
	    Employee d1  = new Employee("d1",1000,500);									
	    development.add(d1);
	    Employee d2  = new Employee("d2",1000,500);									
	    development.add(d2);
	    Employee d3  = new Employee("d3",1000,500);									
	    development.add(d3);
	    Employee d4  = new Employee("d4",1000,500);									
	    development.add(d4);
	    
	    // add the previously created manager into the development collection (but not as the first employee)
	 	// and set them as the manager
	    development.add(developmenthead);
		development.setManager(developmenthead);
		
		// create and add the other employees into the development collection
	    Employee d5  = new Employee("d5",1000,500);									
	    development.add(d5);
	    Employee d6  = new Employee("d6",1000,500);									
	    development.add(d6);
		    
    
	    
	    System.out.println("************************************** manipulate individual employee nodes");
	    hrhead.printPaycheck();
	    d4.printPaycheck();
	    
	    System.out.println("************************************** manipulate a collection node");	    
	    training.printPaycheck();
	    
	    System.out.println("************************************** manipulate the top level node");	   

	    company.printPaycheck();
	    
	    

}

	
}
