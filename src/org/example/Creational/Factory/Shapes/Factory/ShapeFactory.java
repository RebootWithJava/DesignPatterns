package org.example.Creational.Factory.Shapes.Factory;

import java.util.ArrayList;
import java.util.List;

import org.example.Creational.Factory.Shapes.IShape;
import org.example.Creational.Factory.Shapes.IShapeFactory;
import org.example.Creational.Factory.Shapes.implementation.Circle;
import org.example.Creational.Factory.Shapes.implementation.Point;
import org.example.Creational.Factory.Shapes.implementation.Rectangle;
import org.example.Creational.Factory.Shapes.implementation.Square;
import org.example.Creational.Factory.Shapes.implementation.Triangle;

public class ShapeFactory implements IShapeFactory{

	@Override
	public IShape Create(char c) {
		switch (Character.toUpperCase(c))
		{
		case('T'): return new Triangle();
		case('R'): return new Rectangle();
		case('S'): return new Square();
		case('C'): return new Circle();
		default: return new Point();
		}
	}

	@Override
	public List<IShape> Create(String pattern) {
		List<IShape> rv = new ArrayList<IShape>();
		for(int i = 0; i<pattern.length(); i++)
		{
			rv.add(Create(pattern.charAt(i)));
		}
		return rv;
	}

}
