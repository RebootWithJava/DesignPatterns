package org.example.Behavioral.Strategy.Implementation.Eating;

import org.example.Behavioral.Strategy.IEatingStrategy;

public class HerbivoreStrategy implements IEatingStrategy{

	@Override
	public double eat(String Food) {
		if (Food.contains("plant")) return 5;
		else return 5;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Herbivore:5";
	}

}
