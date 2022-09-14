package org.example.Creational.Builder.FluentWithTransitionsStyle;

//this is a sample class showing how to use a builder with fluent methods
//this class has three parts that MUST be assembled in order.
//The engine must be assembled first, then the Exterior and then finally
//the Interior.  Assembling the parts in the wrong order can introduce
//subtle errors that are difficult to detect, but can have catastrophic consequences
//[ this example class does not really have order dependencies, but it serves as an example ]

//the constructor for the ComplexThing is internal to the package, and so a ComplexThing can not
//be created by the normal 'new' process by any outside package.  The only way to create one is to 
//create a so-called ComplexThingBuilder and invoke the build method to do the 'complex' task of 
//assembling the ComplexThing.

//the toString is provide so we can see the internal parts that have been assembled

public class ComplexThing  {
	// notice that since there is not a set of separate classes to hold the various parts, they are given default values over
	// in the builder class' proposed values instead of here.  The only constructor will be providing the data to load into 
	// these fields through the builder's proposed values
		
	// Engine Items
	   String FuelType;
	   double EngineSize;
	   double MaxPower;
	   double MaxSpeed;
	   
	// Exterior Items
	    String Model ;
		String BodyType;
		String ExteriorColor;
		String ExteriorMaterial;
		
	// Interior Items
		int NumberSeats;
		double CargoSpace;
		String InteriorColor;
		String InteriorMaterial;
		
		// this is the only way to construct a complexThing.  The 
		ComplexThing(ComplexThingBuilder builder)
		{
			FuelType = builder.proposedFuelType;
			EngineSize = builder.proposedEngineSize;
			MaxPower = builder.proposedMaxPower;
			MaxSpeed = builder.proposedMaxSpeed;
			
			Model = builder.proposedModel;
			BodyType = builder.proposedBodyType;
			ExteriorColor = builder.proposedExteriorColor;
			ExteriorMaterial = builder.proposedExteriorMaterial;
			
			NumberSeats = builder.proposedNumberSeats;
			CargoSpace = builder.proposedCargoSpace;
			InteriorColor = builder.proposedInteriorColor;
			InteriorMaterial = builder.proposedInteriorMaterial;
		}
		
		public String toString()
		{
			return String.format("ComplexThing Engine: [%s, %f, %f, %f] Exterior: [%s, %s, %s, %s] Interior: [%d, %f, %s, %s]", 
					FuelType,EngineSize,MaxPower,MaxSpeed, 
					Model, BodyType,ExteriorColor, ExteriorMaterial,
					NumberSeats, CargoSpace, InteriorColor, InteriorMaterial);
					
		}
		
		// this method represents an operation on the ComplexThing  
		public String IAmAComplexThingOperation()
		{
			return "Yes I am!";
		}
		

}
