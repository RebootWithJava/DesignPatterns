package org.example.Structural.Composite.LeavesAndNodes;

import java.util.List;

// the employee class is a LEAF node in this example
// it provides an implementation of each operation in the Component class
// and throws an exception when attempting to add or remove items
// it returns null when attempting to retrieve child elements

// the Employee LEAF class does not have a list of employees nor does it have a Unit name
// these items are implemented in the NODE class  (EmployeeComposite)

// both the Leaf (Employee) and the Node (EmployeeComposite) classes extend the Component (EmployeeComponent) class

public class Employee extends EmployeeComponent {
	
	private double PayrollSalary;
	private double FixedExpenses;

	private String EmployeeName;
 
    
    public Employee(String name, double payroll, double expenses)
	{
		EmployeeName = name;
//		UnitName = unit;
		PayrollSalary = payroll;
		FixedExpenses = expenses;
	}
	


	@Override
	public double computePayroll() {
		
		return PayrollSalary;
	}

	@Override
	public double computeExpenses() {
		
		return FixedExpenses;
	}

	@Override
	public String getName() {
		
		return EmployeeName;
	}
	
	
	@Override
	public void printPaycheck(String indent) {
		System.out.printf("%-40s",indent+EmployeeName);
		System.out.printf(" %15.2f",PayrollSalary);
		System.out.printf(" %15.2f\n", FixedExpenses);
		
	}

	@Override
	public void add(EmployeeComponent component) throws Exception {
		throw new Exception("cannot add an Employee component to an Employee");
	}

	@Override
	public void remove(EmployeeComponent component) throws Exception {
		throw new Exception("cannot remove an Employee component to an Employee");
		
	}

	@Override
	public List<EmployeeComponent> getChildren() {
		
		return null;
	}

	@Override
	public EmployeeComponent getChild(int i) {
		
		return null;
	}

}
