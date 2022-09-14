package org.example.Creational.Factory.Shapes.implementation;

import org.example.Creational.Factory.Shapes.IShape;

public class Circle extends Point implements IShape 
{
    double radius=1;
	public Circle(double x, double y, double r) {
		super(x, y);
		radius = r;
		System.out.printf("Constructed a Circle(%f,%f,%f) %s\n",x,y,r,super.toString());
	}
	
	public Circle()
	{
		super();
		radius = 1;
		System.out.printf("Constructed a Default Circle(radius = 1) %s\n",super.toString());

	}
	
	public double getArea()
	{
		return   Math.PI * radius * radius;
	}

	public String toString()
	{
		
		return "Circle: [ radius=" + radius +"] " + super.toString();
	}
	
}
