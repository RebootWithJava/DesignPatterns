package org.example.Behavioral.Strategy.Implementation.Eating;

import org.example.Behavioral.Strategy.IEatingStrategy;

public class OmnivoreStrategy implements IEatingStrategy{

	@Override
	public double eat(String Food) {
		if      (Food.contains("meat")) return 10;
		else if (Food.contains("plant")) return 5;
		else return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Omnivore:5-10";
	}

}

