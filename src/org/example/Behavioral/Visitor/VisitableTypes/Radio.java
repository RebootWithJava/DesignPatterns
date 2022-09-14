package org.example.Behavioral.Visitor.VisitableTypes;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.IAlertVisitor;

public class Radio implements IAlertVisitable
{
	@Override
	public void accept(IAlertVisitor v) {
		v.visit(this);	
	}
	
	public void PublicBroadcast(String message)
	{
		System.out.printf("Radio %s reports this breaking news: '%s'\n", this, message);
	}
}
