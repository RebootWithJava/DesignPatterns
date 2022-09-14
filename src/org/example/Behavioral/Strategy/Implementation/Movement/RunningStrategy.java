package org.example.Behavioral.Strategy.Implementation.Movement;

import org.example.Behavioral.Strategy.IMovementStrategy;

public class RunningStrategy implements IMovementStrategy{

	// average running speed for humans is 4.6 mph = 2.056 meters/sec
	// running is not as energy efficient as walking: say 3 times more costly
	@Override
	public double move(double distance) {
		
		return distance * .003;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "running:.003";
	}

	
}
