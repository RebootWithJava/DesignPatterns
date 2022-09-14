package org.example.Creational.Builder.ConfigurationStyle;

//this is the sub component builder for the ComplexThing's Interior part
//the methods exposed here are visible in the lambda expression
//because the ComplexThingBuilder sends YOU an InteriorBuilder to work with in the lambda configuration function
//you will be adding if you choose to configure the Interior part

public class InteriorBuilder
{
	int proposedNumberSeats;
	double proposedCargoSpace;
	String proposedColor;
	String proposedMaterial;
	
    Interior build()
	{
		return new Interior(this);
	}
    
    public InteriorBuilder setProposedNumberSeats(int number)
	{
		proposedNumberSeats = number;
		return this;
	}
    
    public InteriorBuilder setProposedCargoSpace(double cargoSpace)
	{
		proposedCargoSpace = cargoSpace;
		return this;
	}
    
    public InteriorBuilder setProposedColor(String color)
	{
		proposedColor = color;
		return this;
	}
    public InteriorBuilder setProposedMaterial(String material)
	{
		proposedMaterial = material;
		return this;
	}
}

