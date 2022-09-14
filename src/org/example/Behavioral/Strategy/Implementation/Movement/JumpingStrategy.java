package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class JumpingStrategy implements IMovementStrategy{
    // average jumping speed of a kangaroo is 21 km / hr   = 5.833 meters per sec
	// I will set jumping to 13 time harder than walking
	@Override
	public double move(double distance) {
		// TODO Auto-generated method stub
		return distance * .013; 
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "jumping:.013";
	}

	
}
