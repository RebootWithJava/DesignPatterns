package org.example.Structural.Composite.LeavesAndNodes;

import java.util.ArrayList;
import java.util.List;


//the EmployeeComposite class is a NODE node in this example
//it provides an implementation of each operation in the Component class that 
//aggregates all the children data recursively
//and allows the addition and removal of both LEAF and NODE subordinates
//it allows retrieval and removal of child elements

//the EmployeeComposite NODE class has a list of employees and it has a Unit name
// it also tracks a single subordinate as a 'manager' and has logic to highlight the manager when printing


//both the Leaf (Employee) and the Node (EmployeeComposite) classes extend the Component (EmployeeComponent) class

public class EmployeeComposite extends EmployeeComponent
{
	
	private String unitName;
	private Employee manager; 
	private List<EmployeeComponent> employees = new ArrayList<EmployeeComponent>();
	

	public EmployeeComposite(String unit)
	{
		unitName = unit;
	}
	
	public Boolean setManager(Employee manager)
	{
		if (employees.contains(manager))
		{
			this.manager = manager;
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public double computePayroll() 
	{
		double SubordinatesAggregateSalary = 0;
		for(EmployeeComponent e : employees )
		{
			SubordinatesAggregateSalary += e.computePayroll();
		}
		return  SubordinatesAggregateSalary;
		
	}

	@Override
	public double computeExpenses() {
		double SubordinatesAggregateExpenses = 0;
		for(EmployeeComponent e : employees )
		{
			SubordinatesAggregateExpenses += e.computeExpenses();
		}
		return  SubordinatesAggregateExpenses;
	}

	@Override
	public String getName() {
		
		return unitName;
	}

	@Override
	public void printPaycheck(String indent) {
		
		// print out this NODE information
		System.out.printf("%-40s",indent+unitName);
		System.out.printf(" %15.2f",computePayroll());
		System.out.printf(" %15.2f\n", computeExpenses());
		
		// print out all the subordinates
		for(EmployeeComponent e : employees)
			{
				// if the subordinate is a LEAF employee, then print out an "*" if it is also the manager
				if (e instanceof Employee )
				{
					char managerindicator =  (manager == e) ? '*': ' ';
					System.out.printf("%c%-39s",managerindicator, indent +e.getName());
					
					System.out.printf(" %15.2f", e.computePayroll());
					System.out.printf(" %15.2f\n", e.computeExpenses());
				}
				// if it is a NODE collection, then print it out recursively (and add to the indent)
				else
				{
					e.printPaycheck(indent+"  ");
				}
				
			}
			
		
	}

	@Override
	public void add(EmployeeComponent component) throws Exception {

        if (employees.contains(component))
        {
        	throw new Exception("The employee is already in the component, it cannot be added again");
        }
        employees.add(component);
		
	}

	@Override
	public void remove(EmployeeComponent component) throws Exception {

        if (employees.contains(component))
        {
        	employees.remove(component);
        }
		
	}

	@Override
	public List<EmployeeComponent> getChildren() {
		
		return employees;
	}

	@Override
	public EmployeeComponent getChild(int i) {
		if (i>0 && i<employees.size())
			return employees.get(i);
			else return null;
	}

}
