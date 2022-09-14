package org.example.Creational.Builder.ConfigurationStyle;

// this is the sub component builder for the ComplexThing's Engine part
// the methods exposed here are visible in the lambda expression
// because the ComplexThingBuilder sends YOU an EngineBuilder to work with in the lambda configuration function
// you will be adding if you choose to configure the engine part

public class EngineBuilder
{
	   String proposedFuelType;
	   double proposedEngineSize;
	   double proposedMaxPower;
	   double proposedMaxSpeed;
	   
	   public EngineBuilder setProposedFuelType(String type)
	   {
		   proposedFuelType = type;
		   return this;
	   }
	   
	   public EngineBuilder setProposedEngineSize(double size)
	   {
		   proposedEngineSize = size;
		   return this;
	   }
	   
	   public EngineBuilder setProposedMaxPower(double power)
	   {
		   proposedMaxPower = power;
		   return this;
	   }
	   
	   public EngineBuilder setProposedMaxSpeed(double speed)
	   {
		   proposedMaxSpeed = speed;
		   return this;
	   }
	   
	    Engine build()
	   {
		   
		   return new Engine(this);
	   }
}
