package org.example.Behavioral.Visitor.Implementions;

import org.example.Behavioral.Visitor.IAlertVisitor;
import org.example.Behavioral.Visitor.VisitableTypes.CellPhone;
import org.example.Behavioral.Visitor.VisitableTypes.EMail;
import org.example.Behavioral.Visitor.VisitableTypes.LandPhone;
import org.example.Behavioral.Visitor.VisitableTypes.Radio;
import org.example.Behavioral.Visitor.VisitableTypes.Television;

public class DetailedAlertVisitor implements IAlertVisitor
{

	@Override
	public void visit(CellPhone c) {
		System.out.printf("I am providing details to the %s using CellPhone techniques\n", c);
		
	}

	@Override
	public void visit(EMail e) {
		System.out.printf("I am providing details to the %s using email techniques\n", e);
		
	}

	@Override
	public void visit(LandPhone l) {
		System.out.printf("I am providing details to the %s using Landline techniques\n", l);
		
	}

	@Override
	public void visit(Radio r) {
		System.out.printf("I am providing details to the %s using radio techniques\n", r);
		
	}

	@Override
	public void visit(Television t) {
		System.out.printf("I am providing details to the %s using Television techniques\n", t);
		
	}

}
