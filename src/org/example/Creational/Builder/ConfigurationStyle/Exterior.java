package org.example.Creational.Builder.ConfigurationStyle;

//this class is one of the items that can be assembled into a complexThing
//It contains the Exterior items
//Notice that the constructors are at the package level, so other packages can not
//create an 'Exterior' except using an ExteriorBuilder


public class Exterior
{
	// these fields are the data we are configuring in the ComplexThing builder
	String Model;
	String BodyType;
	String Color;
	String Material;
	
	// this is called by the build method of the complexThing if configuration is desired
    Exterior(ExteriorBuilder builder)
	{
		Model = builder.proposedModel;
		BodyType = builder.proposedBodyType;
		Color = builder.proposedColor;
		Material = builder.proposedMaterial;
	}
    
    // this default constructor is called by the build method if no configuration lambda was added
    Exterior()
    {
    	Model = "corvette";
    	BodyType = "default";
    	Color = "default";
    	Material = "default";
    }
    
    public String toString()
    {
    	return String.format("Exterior: %s %s %s with %s ", Color, Model, BodyType, Material );
    }
	
	
}