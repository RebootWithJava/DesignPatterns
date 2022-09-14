package org.example.aaa.invocation;


import org.example.Creational.Builder.FluentWithTransitionsStyle.ComplexThingBuilder;

public class AnInvoker4BuilderFluentStyle {
	
	static public void run()
	{
		 
         ComplexThingBuilder thingBuilder = new ComplexThingBuilder();
         
         var y = thingBuilder
        		 .setProposedFuelType("gasoline")
	             .setProposedEngineSize(350)
	             .setProposedMaxPower(425)
	             .setProposedMaxSpeed(170)
	             // <---- try dotting (add a (.) before the // ) to see proposals  Look at the set methods
	             	            
	             // note that popup proposals only show (Engine configuration items)
	             
	             .proceedToExterior()    //  popup proposals change to (External configuration items)
	             // <---- try dotting (add a (.) before the // ) to see proposals
	             	             
	             .setProposedBodyType("convertable")
	             .setProposedExteriorColor("white")
	             .setProposedExteriorMaterial("metal")
	             .setProposedModel("corvette")
	             
	             .proceedToInterior()    //  popup proposals change to (Internal configuration items)
	             // <---- try dotting (add a (.) before the // ) to see proposals  Look at the set methods
	             	             
	             .setProposedNumberSeats(2)
	             .setProposedCargoSpace(10)
	             .setProposedInteriorColor("red")
	             .setProposedInteriorMaterial("leather")
	             
	             .build()               //  popup proposals change to ComplexThing execution items
	             // <---- try dotting (add a (.) before the // ) to see proposals   Look at the set methods
        		 ;
	      System.out.println(y);       
	}

}
