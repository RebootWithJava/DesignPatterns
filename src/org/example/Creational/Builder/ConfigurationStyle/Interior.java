package org.example.Creational.Builder.ConfigurationStyle;

//this class is one of the items that can be assembled into a complexThing
//It contains the Interior items
//Notice that the constructors are at the package level, so other packages can not
//create an 'Interior' except using an InteriorBuilder

public class Interior
{
	// these fields are the data we are configuring in the ComplexThing builder
	int NumberSeats;
	double CargoSpace;
	String Color;
	String Material;
	
	// this is called by the build method of the complexThing if configuration is desired
    Interior(InteriorBuilder builder)
	{
		NumberSeats = builder.proposedNumberSeats;
		CargoSpace = builder.proposedCargoSpace;
		Color = builder.proposedColor;
		Material = builder.proposedMaterial;
	}
    
    // this default constructor is called by the build method if no configuration lambda was added
    Interior()
    {
    	NumberSeats = 2;
    	CargoSpace = 0;
    	Color = "default";
    	Material = "default";
    }
    
    public String toString()
    {
    	return String.format("Interior: %d Seats, %f Cargo, %s %s", NumberSeats, CargoSpace, Color, Material);
    }
	
	 
}