package org.example.Creational.Factory.Shapes.implementation;

import org.example.Creational.Factory.Shapes.IShape;

public class Square extends Point implements IShape 
{
    
    double width = 1;
    

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public Square(double x, double y, double s)
	{
		super(x,y);
		this.width = s;
		System.out.printf("Constructed a Square with location (%f,%f,%f) %s\n",x,y,s,super.toString());

	}
	
	public Square()
	{
		super();
		width = 1;
		System.out.printf("Constructed a Default Square(width=1) %s\n",super.toString());
	}

	
	@Override
	public void scale(double amount) {
		width *= amount;
		
	}
	
	public String toString()
	{
		return "Square: [ width=" + width + "] " + super.toString();
	}
	
	

}
