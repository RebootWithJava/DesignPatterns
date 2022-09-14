package org.example.Creational.Factory.Shapes.implementation;

import org.example.Creational.Factory.Shapes.IShape;

public class Point implements IShape {
    double x =0;
    double y = 0;
	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return x;
	}
	
	public Point()
	{
		x = 0;
		y = 0;
		
		System.out.printf("Constructed a Default Point(0,0) %s\n",super.toString());
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Point(double x, double y)
	{
		super();
		this.x = x; this.y = y;
		System.out.printf("Constructed a Point(%f,%f) %s\n",x,y,super.toString());

	}
	
	public String toString()
	{
		return "Point: [" + x + "," + y + "] " + super.toString();
	}

	@Override
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
		
	}

	@Override
	public void scale(double amount) {
		return;
		
	}

}
