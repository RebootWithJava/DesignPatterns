package org.example.Behavioral.Visitor.Implementions;

import org.example.Behavioral.Visitor.IAlertVisitor;
import org.example.Behavioral.Visitor.VisitableTypes.CellPhone;
import org.example.Behavioral.Visitor.VisitableTypes.EMail;
import org.example.Behavioral.Visitor.VisitableTypes.LandPhone;
import org.example.Behavioral.Visitor.VisitableTypes.Radio;
import org.example.Behavioral.Visitor.VisitableTypes.Television;

public class QuickAlertVisitor implements IAlertVisitor{

	String MessageToSend;
	String CountryCode;
	Television.EmergencyOverrideLevelCode Level;
	
	public QuickAlertVisitor(String Message, String CountryCode,Television.EmergencyOverrideLevelCode level )
	{
		MessageToSend = Message;
		this.CountryCode = CountryCode;
		Level = level;
	}
	
	@Override
	public void visit(CellPhone c) {
		c.SendMeAText(MessageToSend);
	}

	@Override
	public void visit(EMail e) {
		e.SendMeAnEMail(MessageToSend);
		
	}

	@Override
	public void visit(LandPhone l) {
		l.CallMe(MessageToSend, CountryCode);
		
	}

	@Override
	public void visit(Radio r) {
		r.PublicBroadcast(MessageToSend);
		
	}

	@Override
	public void visit(Television t) {
		
		t.PublicBroadcast(MessageToSend, Level );
		
	}

}
