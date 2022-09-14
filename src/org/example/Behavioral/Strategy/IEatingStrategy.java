package org.example.Behavioral.Strategy;

public interface IEatingStrategy {
	public String getName();

	public double eat(String Food);  // returns amount of 'power' in calories gained from eating a unit amount of the 'Food'
	                                 // the amount of power depends on the eating strategy and the food
}
