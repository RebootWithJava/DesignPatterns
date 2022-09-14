package org.example.Creational.Factory.Shapes;

public interface IShape
{
	double getX();
	double getY();
	double getArea();
	void move(double dx, double dy);
	void scale(double amount);
	
}
