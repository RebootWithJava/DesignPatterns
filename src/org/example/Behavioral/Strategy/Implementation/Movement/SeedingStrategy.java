package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class SeedingStrategy implements IMovementStrategy{
    // seedlings take time to grow and propagate, but have no energy cost for movement, but a low fixed cost for building seeds
	@Override
	public double move(double distance) {
		
		return .001;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Seeding:.1";
	}

	
}
