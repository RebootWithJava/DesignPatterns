package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class SwimmingStrategy implements IMovementStrategy{
    // humans can swim 2 mph
	// dolphins can swim 20 mph
	// fastest:  mantis shrim 30 mph
	// swimming is going to be set to 7 times harder than walking
	
	
	@Override
	public double move(double distance) {
		
		return distance * .007;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "swiming:.007";
	}

	
}
