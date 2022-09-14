package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class HitchingStrategy implements IMovementStrategy{
    // hitchings use animals to cover more distance, but still take weeks, there is no energy cost for movement but a low cost for the seend
	@Override
	public double move(double distance) {
		
		return .002;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hitching:.2";
	}

	
}
