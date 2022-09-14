package org.example.Behavioral.Visitor.VisitableTypes;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.IAlertVisitor;

public class Television implements IAlertVisitable
{
	EmergencyOverrideLevelCode Level;
	public Television(EmergencyOverrideLevelCode level)
	{
		Level = level;
	}
	@Override
	public void accept(IAlertVisitor v) {
		v.visit(this);	
	}
	
	public void PublicBroadcast(String message,  EmergencyOverrideLevelCode code)
	{
	    int i = code.compareTo(Level);
	    if (i>=0)
	    {
		  System.out.printf("Television %s reports this breaking news: '%s'\n", this, message);
	    }
	    else
	    {
	    	System.out.printf("Television %s has decided to ignore this message\n", this);
	    }
	}
	
	public enum EmergencyOverrideLevelCode
	{
		Informational,
		AmberAlert,
		WeatherAlert,
		Local,
		Regional,
		National,
		Worldwide
	}
}
