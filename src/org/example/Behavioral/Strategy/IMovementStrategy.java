package org.example.Behavioral.Strategy;

public interface IMovementStrategy {
	
	  public String getName();
      public double move(double distance);  // returns the amount of 'power' in calories to move the distance in meters
}
