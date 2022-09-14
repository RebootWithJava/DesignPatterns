package org.example.Behavioral.Visitor;

import org.example.Behavioral.Visitor.VisitableTypes.CellPhone;
import org.example.Behavioral.Visitor.VisitableTypes.EMail;
import org.example.Behavioral.Visitor.VisitableTypes.LandPhone;
import org.example.Behavioral.Visitor.VisitableTypes.Radio;
import org.example.Behavioral.Visitor.VisitableTypes.Television;

public interface IAlertVisitor {
        
	public void visit(CellPhone c);
	public void visit(EMail e);
	public void visit(LandPhone l);
	public void visit(Radio r);
	public void visit(Television t);
	
	// public void visit(QuantumEntanglementCommunicator q);
}
