package org.example.Creational.Builder.ConfigurationStyle;

// this class is one of the items that can be assembled into a complexThing
// It contains the Engine items
// Notice that the constructors are at the package level, so other packages can not
// create an 'Engine' except using an EngineBuilder

public class Engine
{
	// these fields are the data we are configuring in the ComplexThing builder
   String FuelType;
   double EngineSize;
   double MaxPower;
   double MaxSpeed;
   
   
   // this is called by the build method of the complexThing if configuration is desired
   Engine(EngineBuilder builder)
   {
	   FuelType = builder.proposedFuelType;
	   EngineSize = builder.proposedEngineSize;
	   MaxPower = builder.proposedMaxPower;
	   MaxSpeed = builder.proposedMaxSpeed;
   }
   
   // this default constructor is called by the build method if no configuration lambda was added
   Engine()
   {
	   FuelType = "default";
	   EngineSize = 0;
	   MaxPower = 0;
	   MaxSpeed = 0;
	   
   }
   
   public String toString()
   {
	   return String.format("Engine: fuel %s size %f power %f speed %f", FuelType,EngineSize,MaxPower,MaxSpeed);
   }
   
   
}
