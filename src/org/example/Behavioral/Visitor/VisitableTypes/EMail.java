package org.example.Behavioral.Visitor.VisitableTypes;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.IAlertVisitor;

public class EMail implements IAlertVisitable
{
	
	String emailaddress;
	
	public EMail(String address)
	{
		emailaddress = address;
	}
	
	@Override
	public void accept(IAlertVisitor v) {
		v.visit(this);	
	}
	
	public void SendMeAnEMail(String message)
	{
		System.out.printf("sending an email to %s message:'%s\n", emailaddress, message);
	}

}
