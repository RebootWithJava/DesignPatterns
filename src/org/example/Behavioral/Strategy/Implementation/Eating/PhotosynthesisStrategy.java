package org.example.Behavioral.Strategy.Implementation.Eating;

import org.example.Behavioral.Strategy.IEatingStrategy;

public class PhotosynthesisStrategy implements IEatingStrategy{

	@Override
	public double eat(String Food) {
		if (Food.contains("light")) return 1;
		else return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Photosysthesis:1";
	}

}