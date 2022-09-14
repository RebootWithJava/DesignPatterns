package org.example.Creational.Builder.ConfigurationStyle;

// this is a sample class showing how to use a builder with configuration
// this class has three parts that MUST be assembled in order.
// The engine must be created first, then the Exterior and then finally
// the Interior.  Assembling the parts in the wrong order can introduce
// subtle errors that are difficult to detect, but can have catastrophic consequences
// [ this example class does not really have order dependencies, but it serves as an example ]

// the constructor for the ComplexThing is internal to the package, and so a ComplexThing can not
// be created by the normal 'new' process by any outside package.  The only way to create one is to 
// create a so-called ComplexThingBuilder and invoke the build method to do the 'complex' task of 
// assembling the ComplexThing.

// the toString is provide so we can see the internal parts that have been assembled

public class ComplexThing 
{
    private Engine      MyEngine;
    private Exterior    MyExterior;
	private Interior    MyInterior;
	
	ComplexThing(ComplexThingBuilder builder)
	{
		MyEngine = builder.theConfiguredEngine;
		MyExterior = builder.theConfiguredExterior;
		MyInterior = builder.theConfiguredInterior;
	}
	
	public String toString()
	{
		return String.format("ComplexThing [%s] [%s] [%s]", MyEngine, MyExterior, MyInterior);
	}
	
}


