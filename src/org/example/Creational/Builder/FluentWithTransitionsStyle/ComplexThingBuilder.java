package org.example.Creational.Builder.FluentWithTransitionsStyle;


public class ComplexThingBuilder  {
	
	// these three fields hold the configuration classes which limit the available configuration options
	// at any stage in the configuration.  Fluent methods will be used to configure (and potentially reconfigure)
	// items available in the current stage.  Once you proceed to the next stage, then the available options will change
	// and you can not go back to a previous stage.  Using the fluent model the USER of the builder is FORCED to configure the 
	// items in the correct order as part of the builder logic.
	// It is these three Configuration items which control what can be configured at each stage.
	EngineConfiguration   theEngine   = new EngineConfiguration(this);
    ExteriorConfiguration theExterior = new ExteriorConfiguration(this);
	InteriorConfiguration theInterior = new InteriorConfiguration(this);
	
	
	// notice that since there is not a set of separate classes to hold the various parts, they are given default values here
	// in the builder class' proposed values
			
	// Engine Items
	   String proposedFuelType  = "default";
	   double proposedEngineSize =0;
	   double proposedMaxPower =0;
	   double proposedMaxSpeed =0;
	   
	// Exterior Items
	    String proposedModel;
		String proposedBodyType = "default";
		String proposedExteriorColor = "default";
		String proposedExteriorMaterial = "default";
		
	// Interior Items
		int    proposedNumberSeats=2;
		double proposedCargoSpace=0;
		String proposedInteriorColor = "default";
		String proposedInteriorMaterial = "default";
		
		// The FIRST stage is engine Configuration.  The only 'exposed' public methods are the ones to configure the
		// engine, and the one to proceed to the next stage (proceedToExterior).  A convenient method to skip to the end of the
		// build process accepting all configurations to this point and defaulting from here on is also provided (proceedToBuild)
		
		// These are the six 'entry' methods exposed off the Builder, and then exposed from the EngineConfiguration going forward
		// the 'type' of the base (this) object will change from Builder to EngineConfiguration after the first method call
		
		public EngineConfiguration setProposedFuelType(String type)
		{
			proposedFuelType = type;
			return theEngine;
		}
		
		public EngineConfiguration setProposedEngineSize(double size)
		{
			proposedEngineSize = size;
			return theEngine;
		}
		
		public EngineConfiguration setProposedMaxPower(double maxPower)
		{
			proposedMaxPower = maxPower;
			return theEngine;
		}
		
		public EngineConfiguration setProposedMaxSpeed(double maxSpeed)
		{
			proposedEngineSize = maxSpeed;
			return theEngine;
		}
		
		public ComplexThing proceedToBuild()
		{
			return new ComplexThing(this);
		}
		public ExteriorConfiguration proceedToExterior()
		{
			return theExterior;
		}
		
	    
		
		// The FIRST stage is engine Configuration.  The only 'exposed' public methods are the ones to configure the
		// engine, and the one to proceed to the next stage (proceedToExterior).  A convenient method to skip to the end of the
		// build process accepting all configurations to this point and defaulting from here on is also provided (proceedToBuild)
			
		
		public class EngineConfiguration {
		
		// the EngineConfiguration needs to know where the ComplexThingBuilder is so that it can configure the 
		// Engine portion of it.  It will be called 'me', and it is injected in the constructor as the parameter 'it'
		ComplexThingBuilder me;
		
		EngineConfiguration(ComplexThingBuilder it)
		{
			me = it;
		}
		
		
		// These are the six 'entry' methods exposed off the  EngineConfiguration going forward
		// the 'type' of the base (this) object is now EngineConfiguration after the first method call
		public EngineConfiguration setProposedFuelType(String type)
		{
			proposedFuelType = type;
			return theEngine;
		}
		
		public EngineConfiguration setProposedEngineSize(double size)
		{
			proposedEngineSize = size;
			return theEngine;
		}
		
		public EngineConfiguration setProposedMaxPower(double maxPower)
		{
			proposedMaxPower = maxPower;
			return theEngine;
		}
		
		public EngineConfiguration setProposedMaxSpeed(double maxSpeed)
		{
			proposedEngineSize = maxSpeed;
			return theEngine;
		}
		
		public ComplexThing proceedToBuild()
		{
			return new ComplexThing(me);
		}
		
		public ExteriorConfiguration proceedToExterior()
		{
			return theExterior;
		}

	}
	
		
		// The Second stage is Exterior Configuration.  The only 'exposed' public methods are the ones to configure the
		// exterior, and the one to proceed to the next stage (proceedToInterior).  A convenient method to skip to the end of the
		// build process accepting all configurations to this point and defaulting from here on is also provided (proceedToBuild)
					
	public class ExteriorConfiguration {
		
		
		// the ExteriorConfiguration needs to know where the ComplexThingBuilder is so that it can configure the 
		// Exterior portion of it.  It will be called 'me', and it is injected in the constructor as the parameter 'it'
	
		ComplexThingBuilder me;
		
		ExteriorConfiguration(ComplexThingBuilder it)
		{
			me = it;
		}
		
		// These are the six 'phase2' methods exposed off the  ExteriorConfiguration going forward
		// the 'type' of the base (this) object is now ExteriorConfiguration after the proceedToExterior method call
		
		public ExteriorConfiguration setProposedModel(String model)
		{
			proposedModel = model;
			return me.theExterior;
		}
		public ExteriorConfiguration setProposedBodyType(String bodyType)
		{
			proposedBodyType = bodyType;
			return me.theExterior;
		}
		public ExteriorConfiguration setProposedExteriorColor(String exteriorColor)
		{
			proposedExteriorColor = exteriorColor;
			return me.theExterior;
		}
		public ExteriorConfiguration setProposedExteriorMaterial(String exteriorMaterial)
		{
			proposedExteriorMaterial = exteriorMaterial;
			return me.theExterior;
		}
		
		public InteriorConfiguration proceedToInterior()
		{
			return theInterior;
		}
		public ComplexThing proceedToBuild()
		{
			return new ComplexThing(me);
		}
		

	}
	
	
	// The Third and Last stage is Interior Configuration.  The only 'exposed' public methods are the ones to configure the
	// Interior, and the one to proceed to build the ComplexThing (build).  Since this is the last stage a convenient method 
	// to skip to the end of the build process accepting all configurations to this point and defaulting from here on is 
	// not needed.  This stage is ended with a call to build().
	
	public class InteriorConfiguration 
	{
		// the InteriorConfiguration needs to know where the ComplexThingBuilder is so that it can configure the 
		// Interior portion of it.  It will be called 'me', and it is injected in the constructor as the parameter 'it'
			
        ComplexThingBuilder me;
		
		InteriorConfiguration(ComplexThingBuilder it)
		{
			me = it;
		}
		
		// These are the five 'phase3' methods exposed off the  InteriorConfiguration going forward
		// the 'type' of the base (this) object is now InteriorConfiguration after the proceedToInterior method call
			
		public InteriorConfiguration setProposedNumberSeats(int numberSeats)
		{
			proposedNumberSeats = numberSeats;
			return me.theInterior;
		}
		
		public InteriorConfiguration setProposedCargoSpace(double cargoSpace)
		{
			proposedCargoSpace = cargoSpace;
			return me.theInterior;
		}
		
		public InteriorConfiguration setProposedInteriorColor(String interiorColor)
		{
			proposedInteriorColor = interiorColor;
			return me.theInterior;
		}
		
		public InteriorConfiguration setProposedInteriorMaterial(String interiorMaterial)
		{
			proposedInteriorMaterial = interiorMaterial;
			return me.theInterior;
		}
		
		
		// this is the final (terminal) method call, and it causes the Actual ComplexThing to be returned using all the
		// values supplied up to that point.
	    public ComplexThing build()
	    {
	    	return new ComplexThing(me);
	    }
	}
	
	
	

	// all the part classes are 'enclosed' classes and according to the Java language they have access to all the fields of the
	// outer enclosing class  (in this case the ComplexThing)
}






