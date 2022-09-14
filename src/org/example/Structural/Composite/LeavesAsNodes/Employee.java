package org.example.Structural.Composite.LeavesAsNodes;

import java.util.ArrayList;
import java.util.List;


// in this implementation, the Employee class acts as both a LEAF and a NODE
// it has a List of Subordinates embedded in the class and provides logic to
// Recursively invoke itself when the list contains children
public class Employee {
	
	private List<Employee> Subordinates = new ArrayList<Employee>();

	private double PayrollSalary;
	private double FixedExpenses;

	private String EmployeeName;
    private String UnitName;
   
	public Employee(String name, String unit, double payroll, double expenses)
	{
		EmployeeName = name;
		UnitName = unit;
		PayrollSalary = payroll;
		FixedExpenses = expenses;
	}
	
	public void setUnitName(String unit)
	{
		UnitName = unit;
	}
	
	public double computePayroll() {
		
		// if this is a leaf node, then the Computed salary will only be their salary
		// but if this is a CompositeNode, then the Computed salary will include all the salaries beneath this node, plus this node.
		// i.e. the unit level will include the managers salary as well as all the subordinates salaries
		
		double SubordinatesAggregateSalary = 0;
		for(Employee e : Subordinates )
		{
			SubordinatesAggregateSalary += e.computePayroll();
		}
		return PayrollSalary + SubordinatesAggregateSalary;
	}

	
	public double computeExpenses() {
		
		// if this is a leaf node, then the Computed Expenses will only be their Expenses
		// but if this is a CompositeNode, then the Computed expenses will include all the sxpenses beneath this node, plus this node.
		// i.e. the unit level will include the managers Expenses as well as all the subordinates expenses
				
		double SubordinatesAggregateExpenses = 0;
		for(Employee e : Subordinates )
		{
			SubordinatesAggregateExpenses += e.computeExpenses();
		}
		return FixedExpenses + SubordinatesAggregateExpenses;
	}

	
	public String getName() {
		
		if (Subordinates.size()>0) return UnitName;
		return EmployeeName;
	}

     public void printPaycheck()   // default to printing only the main paycheck with no indent
     {
		printPaycheck(false,"");		
	 }
     
     public void printPaycheck(Boolean includeSubordinates)  // default to print with no indent
     {
    	 printPaycheck(includeSubordinates,"");
     }
	
	public void printPaycheck(Boolean includeSubordinates, String indent) 
	{
		// print out the (recursively computed) subordinate aggregate values if they exist and are requested
		if (includeSubordinates && Subordinates.size()>0)
		{
			
			System.out.printf("%-40s",indent+UnitName);
			System.out.printf(" %15.2f", computePayroll());
			System.out.printf(" %15.2f\n", computeExpenses());
			
		}
		
		// print out this node always
		System.out.printf("%-40s",indent+EmployeeName);
		System.out.printf(" %15.2f",PayrollSalary);
		System.out.printf(" %15.2f\n", FixedExpenses);
		
		// print out the actual subordinates (recursively) if they are requested
		if (includeSubordinates)
		{
			for(Employee e : Subordinates)
			{
				e.printPaycheck(includeSubordinates, indent+"  ");
			}
		}
		
		
		
	}

	
	public void add(Employee component)  {
	
		Subordinates.add(component);
		
	}

	
	public void remove(Employee component) {
		
		Subordinates.remove(component);
	}

	
	public List<Employee> getChildren() {
		
		return Subordinates;
	}

	// I decided to return null rather than throwing an exception when an invalid child index is provided
	public Employee getChild(int i) {
		
		if (i>=0 && i<Subordinates.size())  // return the correct child if the range is valid
		return Subordinates.get(i);
		else return null;                   // otherwise return null
	}

}
