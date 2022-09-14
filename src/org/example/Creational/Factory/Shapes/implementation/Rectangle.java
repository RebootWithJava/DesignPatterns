package org.example.Creational.Factory.Shapes.implementation;

public class Rectangle extends Square {

	double height;

	
	public Rectangle(double x, double y, double w, double h) {
		super(x, y, w);
		height = h;
		System.out.printf("Constructed a Rectangle(%f,%f,%f,%f) %s\n",x,y,w,h,super.toString());
		
	}
	
	public Rectangle()
	{
		super();
		height = 2;

		System.out.printf("Constructed a Default Rectangle(height= 2) %s\n",super.toString());
	}
	
	public double getArea()
	{
		return height * width;
	}
	
	public String toString()
	{
		return "Rectangle: [ height=" + height +"] " + super.toString();
	}

}
