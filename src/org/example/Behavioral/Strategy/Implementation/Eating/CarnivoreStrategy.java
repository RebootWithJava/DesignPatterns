package org.example.Behavioral.Strategy.Implementation.Eating;

import org.example.Behavioral.Strategy.IEatingStrategy;

public class CarnivoreStrategy implements IEatingStrategy{

	@Override
	public double eat(String Food) {
		if (Food.contains("meat")) return 10;
		else return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Carnivore:10";
	}

}
