package org.example.Behavioral.Strategy;

public interface ILivingThingContext {
	
	public void setEatingStrategy(IEatingStrategy strategy);
	public IEatingStrategy getEatingStrategy();
	
	public void setMovementStrategy(IMovementStrategy strategy);
	public IMovementStrategy getMovementStrategy();
	
	
	// note- the exposed methods from the context do not have to match the 
	// exposed methods in the strategy.
	//   there is a  Context-algorithm
	//     and a    Strategy-algorithm
	//   the context implementation must know how to transform the context algorithm into the strategy algorithm
	public void move(double distance);
	public void eat(String food);

}
