package org.example.aaa.invocation;

import java.util.ArrayList;
import java.util.List;

import org.example.Behavioral.Visitor.IAlertVisitable;
import org.example.Behavioral.Visitor.Implementions.DetailedAlertVisitor;
import org.example.Behavioral.Visitor.Implementions.QuickAlertVisitor;
import org.example.Behavioral.Visitor.VisitableTypes.CellPhone;
import org.example.Behavioral.Visitor.VisitableTypes.EMail;
import org.example.Behavioral.Visitor.VisitableTypes.LandPhone;
import org.example.Behavioral.Visitor.VisitableTypes.Radio;
import org.example.Behavioral.Visitor.VisitableTypes.Television;

public class AnInvoker4BehavioralVisitor {

	public static void run() 
	{
		System.out.println("******************* Creating the object structure");
		
		CellPhone p1 = new CellPhone("111-222-3333");
		CellPhone p2 = new CellPhone("444-555-6666");
		CellPhone p3 = new CellPhone("777-888-9999");
		
		EMail m1 = new EMail("aaa@bbb.com");
		EMail m2 = new EMail("ccc@ddd.com");
		EMail m3 = new EMail("ee@ffff.com");
		EMail m4 = new EMail("g@hhhhh.com");
		EMail m5 = new EMail("iiii@jj.com");
		
		LandPhone land1 = new LandPhone("101-202-3003","US");
		LandPhone land2 = new LandPhone("404-505-6006","US");
		LandPhone land3 = new LandPhone("707-808-9009","UK");
		LandPhone land4 = new LandPhone("102-304-5006","CA");
		
		Radio r1 = new Radio();
		Radio r2 = new Radio();
		
		Television t1 = new Television(Television.EmergencyOverrideLevelCode.Local);
		Television t2 = new Television(Television.EmergencyOverrideLevelCode.Informational);
		Television t3 = new Television(Television.EmergencyOverrideLevelCode.Worldwide);
		
		
		
		List<IAlertVisitable> items = new ArrayList<IAlertVisitable>();
		items.add(p1); items.add(p2); items.add(p3); 
		items.add(m1); items.add(m2); items.add(m3); items.add(m4); items.add(m5);
		items.add(land1); items.add(land2); items.add(land3); items.add(land4);
		items.add(r1); items.add(r2);
		items.add(t1); items.add(t2); items.add(t3);
		
		System.out.println("******************* Creating the Visitors");

		
		QuickAlertVisitor v1 = new QuickAlertVisitor("this is a local message", "US", Television.EmergencyOverrideLevelCode.Local);
		QuickAlertVisitor v2 = new QuickAlertVisitor("this is a worldwide message", "CA", Television.EmergencyOverrideLevelCode.Worldwide);
	    DetailedAlertVisitor v3 = new DetailedAlertVisitor();
		
		System.out.println("**********************************************************");
		System.out.println("******************* Sending the first visitor on its trips");
		System.out.println("**********************************************************");

	    for(var x : items)
	    {
	    	x.accept(v1);
	    }
	    
	    System.out.println("**********************************************************");
	    System.out.println("*******************Sending the second visitor on its trips");
	    System.out.println("**********************************************************");

	    
	    for(var x : items)
	    {
	    	x.accept(v2);
	    }
	    
	    
	    System.out.println("**********************************************************");
	    System.out.println("*******************Sending the third visitor on its trips");
	    System.out.println("**********************************************************");
	    
	    for(var x : items)
	    {
	    	x.accept(v3);
	    }
	    
	}
	

}
