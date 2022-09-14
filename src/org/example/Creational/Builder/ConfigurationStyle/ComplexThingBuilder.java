package org.example.Creational.Builder.ConfigurationStyle;

// this complexthingbuilder is responsible for configuring the various parts of the complexthing in the proper order


public class ComplexThingBuilder
{
	// these fields are where we hold the parts as they are being assembled.
	// there are three parts, so we have a reference variable for each part
	// each part is in turn created by invoking that part's own builder at the appropriate time
    Engine   theConfiguredEngine = null;	
    Exterior theConfiguredExterior = null;
    Interior theConfiguredInterior = null;
 
    // these fields are used to HOLD the configuration lambda expression to configure the
    // various parts.  The user of the builder MAY provide (but they are not required to) a
    // configuration lambda expression used to configure the specific part.  This expression
    // is stored here, and is then invoked at the appropriate time during the construction process
    // these variable allow configuration logic to be supplied independent of the construction logic
    // and the order of adding the configuration lambda is NOT important.  Once the build process is
    // invoked, the lambdas will be INVOKED in the correct order
	private EngineConfiguration   theAddedEngineConfig = null; 
	private ExteriorConfiguration theAddedExteriorConfig = null;
	private InteriorConfiguration theAddedInteriorConfig = null;
	
	
	// these interfaces define the logic for expressing the lambda expression as a parameter
	// to a 'Config' method.  Each Config Lambda expression returns void (nothing) and accepts
	// an appropriate builder as its single parameter
	public interface EngineConfiguration
	{
		void Config(EngineBuilder builder);
	}
	public interface ExteriorConfiguration
	{
		void Config(ExteriorBuilder builder);
	}
	public interface InteriorConfiguration
	{
		void Config(InteriorBuilder builder);
	}
	
	// these public methods allow the lambda expression to be supplied to our builder in any order, all the caller
	// has to do is invoke the appropriate addXXXConfig method, and the lambda passed in as the 'config' parameter 
	// will be saved into the appropriate variable (see lines 22 - 24 above)
	
	public void addEngineConfig(EngineConfiguration config) throws Exception
	{
		if (null == theAddedEngineConfig) theAddedEngineConfig = config;
		else throw new Exception("The Engine can only be configured once, it has already been configured");
	}
	
	public void addExteriorConfig(ExteriorConfiguration config) throws Exception
	{
		if (null == theAddedExteriorConfig) theAddedExteriorConfig = config;
		else throw new Exception("The Exterior can only be configured once, it has already been configured");
	}
	
	public void addInteriorConfig(InteriorConfiguration config) throws Exception
	{
		if (null == theAddedInteriorConfig) theAddedInteriorConfig = config;
		else throw new Exception("The Interior can only be configured once, it has already been configured");
	}
	
	
	// this is the main build for the complexthingbuilder.  It checks each lambda (in the correct order) regardless of how they 
	// were added to the builder, they will be invoked in the order here.  If the config is null, then no configuration was
	// added, and a default item will be used.  If configuration is desired, then a sub builder is invoked for each item
	// needing configuration, and then the configured item is remembered into the primary assembled parts list (see lines 11-13)
	
	public ComplexThing build()
	{
        // assemble the engine first
		if (theAddedEngineConfig!=null) 
			{
			    
			    EngineBuilder theLocalEngineBuilder = new EngineBuilder();
			    theAddedEngineConfig.Config(theLocalEngineBuilder);
			    theConfiguredEngine = theLocalEngineBuilder.build();
			}
		else
		{
			theConfiguredEngine = new Engine();
		}
		
		
		// now assemble the exterior
		if (theAddedExteriorConfig!=null) 
		{
		    
		    ExteriorBuilder theLocalExteriorBuilder = new ExteriorBuilder();
		    theAddedExteriorConfig.Config(theLocalExteriorBuilder);
		    theConfiguredExterior = theLocalExteriorBuilder.build();
		}
		else
		{
			theConfiguredExterior = new Exterior();
		}
		
		
		// now assemble the interior
		
		if (theAddedInteriorConfig!=null) 
		{
		    
		    InteriorBuilder theLocalInteriorBuilder = new InteriorBuilder();
		    theAddedInteriorConfig.Config(theLocalInteriorBuilder);
		    theConfiguredInterior = theLocalInteriorBuilder.build();
		}
		else
		{
			theConfiguredInterior = new Interior();
		}
		
		
		// now pass the assembled parts to the complexThing so it can copy the data
		// notice that the parts are assembled in order Engine - Exterior - Interior
		// but the configuration items can be added in any order (or not at all), since they are not actually executed
		// until 'build()' is called.
			
		return new ComplexThing(this);
	}
	
}


