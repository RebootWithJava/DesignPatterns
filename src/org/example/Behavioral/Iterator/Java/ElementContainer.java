package org.example.Behavioral.Iterator.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this is the class that contains the Tax Line Item records
// it is not a typical list and is not a typical dictionary
// it is organized into a Map where the state abbreviation is
// used to find ALL the associated tax brackets for the given state
// each item in the Map is in fact a List of tax brackets
//   the custom iterator must provide each tax bracket for a state
//   one-tax-bracket-at-a-time until the state has no more
//   then it should move on to the next state automatically
//   ending only when all tax brackets have been served


// in order to 'activate' the for(var x : container) Java syntax
// the container must implement the Iterable<T> interface
// which requires the iterator() method to be implemented
public class ElementContainer implements Iterable<ContainedElement>
{
	// this is the HashMap (a dictionary type) holding the list of tax brackets
  Map<String,List<ContainedElement>> theData = new HashMap<String,List<ContainedElement>>();
  
  
  
  // this method allows the Container to be filled
  // if this is the first tax bracket for a state, then a new list is created
  // otherwise the bracket is added to the previously created list
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

  
    // this is the only required method that the container must provide
    //   you are required to manufacture an iterator and supply it here
    //   a new instance of the ElementIterator is created from the container
    //   and is passed the container as a parameter.  The ElementIterator
    //   must implement the Iterator<ContainedElement> in order to activate
    //   the for(var x : container) Java syntax
	@Override
	public java.util.Iterator<ContainedElement> iterator() 
	{
		
		return new ElementIterator(this);
	}
}
