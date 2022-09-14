package org.example.Behavioral.Iterator.NET;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//this is the class that contains the Tax Line Item records
//it is not a typical list and is not a typical dictionary
//it is organized into a Map where the state abbreviation is
//used to find ALL the associated tax brackets for the given state
//each item in the Map is in fact a List of tax brackets
//the custom iterator must provide each tax bracket for a state
//one-tax-bracket-at-a-time until the state has no more
//then it should move on to the next state automatically
//ending only when all tax brackets have been served

// this class is intended to show how you can implement the alternative .net style of iteration if desired
// by implementing the IEnumerable<T> interface  (not part of standard JAVA)

public class ElementContainer implements IEnumerable<ContainedElement>
{
  Map<String,List<ContainedElement>> theData = new HashMap<String,List<ContainedElement>>();
  
  
  
  
  public void AddElement(ContainedElement e)
  {
	  if (theData.containsKey(e.Key))
	  {
		  var list = theData.get(e.Key);
		  list.add(e);
	  }
	  else
	  {
		  List<ContainedElement> list = new ArrayList<ContainedElement>();
		  list.add(e);
		  theData.put(e.Key, list);
		  
	  }
  }

	@Override
	public IEnumerator<ContainedElement> getEnumerator()
	{
		// TODO Auto-generated method stub
		return new ElementEnumerator(this);
	}
}

