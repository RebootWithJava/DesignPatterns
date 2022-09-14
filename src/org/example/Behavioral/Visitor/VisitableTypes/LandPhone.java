package org.example.Behavioral.Visitor.VisitableTypes;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.IAlertVisitor;

public class LandPhone implements IAlertVisitable 
{
	String number;
	String countryCode;
	
	public LandPhone(String number, String CountryCode)
	{
		this.number = number;
		this.countryCode = CountryCode;
	}
	
	@Override
	public void accept(IAlertVisitor v) {
		v.visit(this);	
	}
	
	public void CallMe(String message, String CountryCode)
	{
		if (countryCode.equalsIgnoreCase(CountryCode))
		{
		    System.out.printf("Dialing  number %s with message: %s\n", 
				number,message);
		}
		else
		{
			System.out.printf("This number (%s) is not in the country (%s)\n", 
					number,CountryCode);
		}
	}
}
