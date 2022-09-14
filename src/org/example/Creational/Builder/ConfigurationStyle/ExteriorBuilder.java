package org.example.Creational.Builder.ConfigurationStyle;

//this is the sub component builder for the ComplexThing's Exterior part
//the methods exposed here are visible in the lambda expression
//because the ComplexThingBuilder sends YOU an ExteriorBuilder to work with in the lambda configuration function
//you will be adding if you choose to configure the Exterior part

public class ExteriorBuilder
{
	String proposedModel;
	String proposedBodyType;
	String proposedColor;
	String proposedMaterial;
	
	
	Exterior build()
	{
		return new Exterior(this);
	}
	
	public ExteriorBuilder setProposedModel(String model)
	{
		proposedModel = model;
		return this;
	}
	
	public ExteriorBuilder setProposedBodyType(String type)
	{
		proposedBodyType = type;
		return this;
	}
	
	public ExteriorBuilder setProposedColor(String color)
	{
		proposedColor = color;
		return this;
	}
	
	public ExteriorBuilder setProposedMaterial(String material)
	{
		proposedMaterial = material;
		return this;
	}
}
