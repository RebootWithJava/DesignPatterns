package org.example.Behavioral.Visitor.VisitableTypes;


public class QuantumEntanglementCommunicator // implements IAlertVisitable
{
	//	@Override
	//	public void accept(IAlertVisitor v) {
	//		v.visit(this);	
	//	}
	
	public void PublicBroadcast(String message)
	{
		System.out.printf("QuantumEntanglement %s reports this breaking news: '%s'", this, message);
	}
}
