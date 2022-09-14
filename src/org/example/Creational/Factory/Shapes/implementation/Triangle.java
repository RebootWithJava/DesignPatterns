package org.example.Creational.Factory.Shapes.implementation;

import org.example.Creational.Factory.Shapes.IShape;

public class Triangle extends Point implements IShape {
	double height = 4;
	double base = 1;
	
	public Triangle(double x, double y, double height, double base) {
		super(x, y);
		this.height = height;
		this.base = base;
		System.out.printf("Constructed a Triangle with location (%f,%f) and size (height:%f,base:%f)\n",x,y,height,base);

	}
	
	public Triangle()
	{
		super();
		height = 4;
		base = 1;
		System.out.printf("Constructed a Default Triangle(height=4, base=1) %s\n",super.toString());
	}
	
	public double getArea()
	{
		return   .5 * base * height;
	}

	public String toString()
	{
		return "Triangle: [ base=" + base +", height=" + height + "] "+ super.toString();
	}

}
