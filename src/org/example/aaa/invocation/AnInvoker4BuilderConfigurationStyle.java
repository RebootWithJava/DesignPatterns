package org.example.aaa.invocation;

import org.example.Creational.Builder.ConfigurationStyle.ComplexThing;
import org.example.Creational.Builder.ConfigurationStyle.ComplexThingBuilder;

public class AnInvoker4BuilderConfigurationStyle {
	
	

		public static void run() throws Exception {

	         ComplexThing x;
	         System.out.println("********************* Create a ComplexThingBuilder");
	         ComplexThingBuilder thingBuilder = new ComplexThingBuilder();
             System.out.println("********************* invoking Configuration out of expected order");
	         
             System.out.println("********************* Add Exterior Configuration");
//          // this is the Configuration style WITHOUT any println statements [i.e. only one statement in the lambda]

//	         thingBuilder.addExteriorConfig(e-> e
//	        		 .setProposedModel("corvette")
//	        		 .setProposedBodyType("coup")
//	        		 .setProposedColor("white")
//	        		 .setProposedMaterial("BondedCarbonFiber")  // no ;
//	        		 );  // no }
	         
//           // this is the required style when the lambda has more than one statement (notice addition of { } and ; )
	         thingBuilder.addExteriorConfig(e-> {e									// notice { here
	        		 .setProposedModel("corvette")
	        		 .setProposedBodyType("coup")
	        		 .setProposedColor("white")
	        		 .setProposedMaterial("BondedCarbonFiber");                     // notice ; here
	         System.out.println("Exterior Configuration is now executing");			// extra statement here
	         });																	// notice } here
	            System.out.println("********************* Add Interior Configuration");	         
//           // this is the configuration style WITHOUT any println statements [i.e. only one statement in the lambda]
//	         thingBuilder.addInteriorConfig(e -> e
//	                 .setProposedNumberSeats(2)
//	                 .setProposedColor("red")
//	                 .setProposedMaterial("leather")
//	                 .setProposedCargoSpace(20)
//	        		 );
	         
//           // this is the required style when the lambda has more than one statement (notice addition of { } and ;)
	         thingBuilder.addInteriorConfig(e -> {e									// notice { here
	                 .setProposedNumberSeats(2)
	                 .setProposedColor("red")
	                 .setProposedMaterial("leather")								
	                 .setProposedCargoSpace(20);									// notice ; here
	         System.out.println("Interior Configuration is now executing");			// extra statement here
	         });																	// notice } here
	         
	         
	         System.out.println("********************* Add Engine Configuration");
//           // this is the Configuration style WITHOUT any println statements [i.e. only one statement in the lambda]
//	         thingBuilder.addEngineConfig( e->  e                                	// no {
//	                .setProposedFuelType("gasoline")
//	                .setProposedEngineSize(350)
//	                .setProposedMaxPower(425)
//	                .setProposedMaxSpeed(170)                                     	// no ;
//	         );                                                                   	// no }
	         
//           // this is the required style when the lambda has more than one statement (notice addition of { } and ; )
	         thingBuilder.addEngineConfig( e-> { e									// notice { here
	                .setProposedFuelType("gasoline")
	                .setProposedEngineSize(350)
	                .setProposedMaxPower(425)
	                .setProposedMaxSpeed(170);                                    	// notice ; here
	                System.out.println("Engine Configuration is now executing");	// extra statement here
	         });                                                                  	// notice } here
	         
    
	         
	         System.out.println("********************* Configuration is finished");
	         System.out.println("********************* Invoking Build");
	         x = thingBuilder.build();
	         System.out.println("********************* Build is finished");
	         System.out.println("********************* Note:  Configuration was EXECUTED during build in correct order");
	         
	         
	         System.out.println(x);



	}

}
