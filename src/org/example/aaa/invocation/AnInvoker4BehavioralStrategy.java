package org.example.aaa.invocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.example.Behavioral.Strategy.Implementation.Eating.AbsorbtionStrategy;
import org.example.Behavioral.Strategy.Implementation.Eating.CarnivoreStrategy;
import org.example.Behavioral.Strategy.Implementation.Eating.HerbivoreStrategy;
import org.example.Behavioral.Strategy.Implementation.Eating.OmnivoreStrategy;
import org.example.Behavioral.Strategy.Implementation.Eating.PhotosynthesisStrategy;
import org.example.Behavioral.Strategy.Implementation.LivingThings.LivingThing;
import org.example.Behavioral.Strategy.Implementation.Movement.HitchingStrategy;
import org.example.Behavioral.Strategy.Implementation.Movement.JumpingStrategy;
import org.example.Behavioral.Strategy.Implementation.Movement.RunningStrategy;
import org.example.Behavioral.Strategy.Implementation.Movement.SeedingStrategy;
import org.example.Behavioral.Strategy.Implementation.Movement.SwimmingStrategy;
import org.example.Behavioral.Strategy.Implementation.Movement.WalkingStrategy;

public class AnInvoker4BehavioralStrategy {
	
	static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
	
	public static void run() throws IOException
	{
		LivingThing p = new LivingThing("plant", new PhotosynthesisStrategy(), new SeedingStrategy(), 1);
		LivingThing f = new LivingThing("fish", new HerbivoreStrategy(), new SwimmingStrategy(), 10);
		LivingThing w = new LivingThing("weed", new AbsorbtionStrategy(), new HitchingStrategy(), 1);
		LivingThing c = new LivingThing("cat", new CarnivoreStrategy(), new WalkingStrategy(),50);
		LivingThing h = new LivingThing("human", new OmnivoreStrategy(), new RunningStrategy(),100);
		LivingThing k = new LivingThing("kangaroo", new HerbivoreStrategy(), new JumpingStrategy(), 100); 
		LivingThing l = new LivingThing("lion", new CarnivoreStrategy(), new RunningStrategy(), 200); 
		
		List<LivingThing> things = new ArrayList<LivingThing>();
		things.add(p); things.add(f); things.add(w); things.add(c); things.add(h); things.add(k); things.add(l);
		
		while(true)
		{
			doActivity(1000,"light",things); doActivity(1000,"light,nutrient",things); doActivity(1000,"light",things);
			pause();
			doActivity(1000,"light,nutrient",things);doActivity(1000,"light",things); doActivity(1000,"light,nutrient",things);
			pause();
			doActivity(1000,"light",things); doActivity(1000,"light,nutrient",things); doActivity(1000,"light",things);
			doActivity(1000,"light,plant",things);
			doActivity(1000,"light,meat",things); doActivity(1000,"light,nutrient",things); doActivity(1000,"light",things);
			pause();
			doActivity(1000,"meat,plant",things); doActivity(10000,"nutrient",things); doActivity(1000,"light",things);
		}
	}
	
	public static void doActivity(double distance, String food, List<LivingThing> things)
	{
		System.out.printf("***********************activity(%f, %s) **************************\n",distance,food);
		for(LivingThing l : things)
		{
			l.move(distance);
			l.eat(food);
			System.out.println(l);
		}
		System.out.println("***********************next activity**************************");
	}
	
	public static void pause() throws IOException
	{
		System.out.println("press Return to continue...");
		reader.readLine();
	}

}
