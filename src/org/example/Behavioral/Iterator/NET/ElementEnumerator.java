package org.example.Behavioral.Iterator.NET;

import java.util.ArrayList;
import java.util.List;

//this is the hardest part of the Iterator syntax.  You must provide an implementation of the
//required methods in the IEnumerator<T> interface demonstrating the .net style iteration
//   (not part of JAVA, but can be simulated if desired)
//
//    Boolean          Next();
//    ContainedElement getCurrent();
//    void             Reset();

//this iterator follows the .net style which  allows you to read an item multiple times using the getCurrent()
//    method.  The next time you call getCurrent() you will get the same item.
//             the Next() method is used to move to the next element and 
//                                       to tell when you are finished consuming all the elements
//
//everything else is overhead for maintaining the current location in the iterator
//this iterator must know where the data is stored:  A HashMap
//which key is being processed:   					keyIndex
//which list item is being processed:				CurrentIndex;
//
//this implementation also caches the list of all keys at construction time into 'CurrentKeys'
//

public class ElementEnumerator implements IEnumerator<ContainedElement>
{
   
	ElementContainer it; 
	List<String> CurrentKeys;
	int keyIndex;
	int CurrentIndex;
	
	// this constructor accepts a parameter identifying which container is being enumerated
	// it initializes the variables and creates the list of keys
	ElementEnumerator(ElementContainer that)
	{
		it = that;
		CurrentIndex = -1;
    	keyIndex = 0;
    	CurrentKeys = new ArrayList<String>();
    	for (String k : it.theData.keySet())
    	{
    		CurrentKeys.add(k);
    	}
	}
	
    // 1. validate that the keyIndex is appropriate, otherwise return null;
	// 2. validate that Next() has been called to position to the first element
	// 3. get the current list for the keyIndex
	// 4. validate that there is an item left in the list. 

	@Override
	public ContainedElement getCurrent() {
		
		if (keyIndex >=CurrentKeys.size()) return null;  // in case the map is empty
		if (CurrentIndex == -1) return null;             // in case you read current before calling Next() to position to the first item
		var list = it.theData.get(CurrentKeys.get(keyIndex));
		var count = list.size();
		if (CurrentIndex < count) return list.get(CurrentIndex);  // return the current item in the current LIST
        return null;
	}

	
	// this resets all variables and recreates the list of keys.  the old list of keys is now garbage.
    // it initializes the variables and creates the list of keys
	@Override
	public void Reset() {
		CurrentIndex = -1;
    	keyIndex = 0;
    	CurrentKeys = new ArrayList<String>();
    	for (String k : it.theData.keySet())
    	{
    		CurrentKeys.add(k);
    	}
		
	}
	
	// this moves to the next item if available and updates all index variables appropriately
	//   it checks to see if there are any elements left in the current key, and if not 
	//   then it checks to see if there are any more keys
	
	public Boolean Next() {
		
		ContainedElement rv = nextElementThisKey();
		if (rv != null) return true;
		var keyCount = it.theData.keySet().size();
		if (keyIndex < keyCount) // there is another key available
		{
			keyIndex++;
			if (keyIndex >=CurrentKeys.size()) return false;  // in case the map is empty
			CurrentIndex = 0;
			rv =  getCurrent();
			return (rv != null);
		}
		
		return false;
	}
	
	// this updates the currentindex and then returns the next element for the current key
	// or returns null if there is not a next current element
	
	ContainedElement nextElementThisKey()
	{
		if (keyIndex >=CurrentKeys.size()) return null;  // in case the map is empty
		var list = it.theData.get(CurrentKeys.get(keyIndex));
		var count = list.size();
		if (CurrentIndex < count-1) return list.get(++CurrentIndex);  // return the next item in the current LIST
        return null;
	}
	
	
		
}
