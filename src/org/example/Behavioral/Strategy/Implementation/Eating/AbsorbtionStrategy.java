package org.example.Behavioral.Strategy.Implementation.Eating;

import org.example.Behavioral.Strategy.IEatingStrategy;

public class AbsorbtionStrategy implements IEatingStrategy{

	@Override
	public double eat(String Food) {
		if (Food.contains("nutrient")) return 3;
		else return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Absorbtion:3";
	}

}
