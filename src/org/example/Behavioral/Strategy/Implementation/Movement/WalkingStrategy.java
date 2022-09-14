package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class WalkingStrategy implements IMovementStrategy{

	// average walking speed for humans is 3.0 mph = 1.34 meters/sec
	// energy cost will be set to 1 unit of energy for 1000 meters of movement
	@Override
	public double move(double distance) {
		// TODO Auto-generated method stub
		return distance/1000;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "walking:.001";
	}

	
}
