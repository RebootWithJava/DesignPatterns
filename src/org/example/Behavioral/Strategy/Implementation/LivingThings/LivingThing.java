package org.example.Behavioral.Strategy.Implementation.LivingThings;

import org.example.Behavioral.Strategy.IEatingStrategy;
import org.example.Behavioral.Strategy.ILivingThingContext;
import org.example.Behavioral.Strategy.IMovementStrategy;

public class LivingThing implements ILivingThingContext {

	String name;
	IEatingStrategy eating;
	IMovementStrategy movement;
	
	
	double  storedEnergy;
	
	public LivingThing(String name ,IEatingStrategy eating, IMovementStrategy movement, double initialEnergy)
	{
		this.name     = name;
		this.eating   = eating;
		this.movement = movement;
		storedEnergy = initialEnergy;
	}
	
	
	
	@Override
	public void setEatingStrategy(IEatingStrategy strategy) {


		eating = strategy;
		
	}

	@Override
	public IEatingStrategy getEatingStrategy() {
		
		return eating;
	}

	@Override
	public void setMovementStrategy(IMovementStrategy strategy) {
		 
		movement = strategy;
		
		
	}

	@Override
	public IMovementStrategy getMovementStrategy() {
		
		return movement;
	}

	@Override
	public void move(double distance) {
		
		if (storedEnergy >0 ) storedEnergy -= movement.move(distance);
		
		
	}

	@Override
	public void  eat(String food) {
		
		if (storedEnergy >0 ) storedEnergy += eating.eat(food);
	}
	
	public String toString()
	{
		if (storedEnergy >0 )
		return String.format(     "%-35s>%-20s         with %f energy left", super.toString(), name, storedEnergy);
		else return String.format("%-35s>%-20s is dead with %f energy left", super.toString(), name, storedEnergy);
	}

}
