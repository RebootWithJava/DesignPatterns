package org.example.aaa.invocation;

import org.example.Creational.Factory.Shapes.Factory.ShapeFactory;



public class AnInvoker4Factory {

	public static void run() {
		
		var f = new ShapeFactory();
		System.out.println("*******************  Create the Factory");
		
		System.out.println("*******************  use the Factory to create a single square");		
        f.Create('s');
		System.out.println("*******************  use the Factory to create a single circle");		
        f.Create('c');
        System.out.println("*******************  use the Factory to create a list of items using a pattern 'ScTrps'");	
		var data = "ScTrps";
        var answer = f.Create(data);
        System.out.println("*******************  print out the list");	
		
		
		for(var item : answer)
		{
			System.out.println(item);
		}
	}

}
