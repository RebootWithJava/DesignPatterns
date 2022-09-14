package org.example.Behavioral.Visitor.VisitableTypes;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.IAlertVisitor;

public class CellPhone implements IAlertVisitable
{
    String phoneNumber;
    
    public CellPhone(String number)
    {
    	phoneNumber = number;
    }
    
    
	@Override
	public void accept(IAlertVisitor v) {
		v.visit(this);	
	}
	
	public void SendMeAText(String textmessage)
	{
		System.out.printf("Sending a text to '%s' message:'%s'\n", phoneNumber,textmessage);
	}

}
