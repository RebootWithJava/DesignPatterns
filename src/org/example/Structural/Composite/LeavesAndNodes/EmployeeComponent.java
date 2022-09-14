package org.example.Structural.Composite.LeavesAndNodes;

import java.util.List;

// this is the COMPONENT class that acts as an abstract class for both LEAF and NODE elements
// this allows a client to work with both LEAFS and NODES using the same logic

public abstract class EmployeeComponent 
{

	// Operations (specific for Employee Components)
	 public abstract double computePayroll();
	 public abstract double computeExpenses();
	 public abstract String getName();
	 
	 // the following function provides a 'default' indent value when you do not want to supply it manually
	 public          void   printPaycheck() { printPaycheck(""); }
	 public abstract void   printPaycheck(String indent);
	 
	// Composite Operations (generic for Composite)
	 
	 // Leaves and Nodes returns void, and may throw an exception (in the LEAF implementation)
	 public  abstract void add(EmployeeComponent component) throws Exception;    
	 public  abstract void remove(EmployeeComponent component) throws Exception; 
	 // ******************************************************
	 public  abstract List<EmployeeComponent> getChildren();      
	 public  abstract EmployeeComponent getChild(int i);           
}