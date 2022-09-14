package org.example.Creational.Factory.Shapes;

import java.util.List;

public interface IShapeFactory 
{
    IShape Create(char c);
    List<IShape> Create(String pattern);
}
