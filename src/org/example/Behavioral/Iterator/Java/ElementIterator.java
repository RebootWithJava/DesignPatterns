package org.example.Behavioral.Iterator.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// this is the hardest part of the Iterator syntax.  You must provide an implementation of the
// required methods in the Iterator<ContainedElement> interface:
//       Boolean          hasNext();
//       ContainedElement next();

//  this iterator follows the JAVA style which only allows you to read an item one time using the next()
//       method.  The next time you call next() you will get the next item.
//                the hasNext() method is used to tell when you are finished consuming all the elements
//  
//  everything else is overhead for maintaining the current location in the iterator
//   this iterator must know where the data is stored:  A HashMap
//   which key is being processed:   					keyIndex
//   which list item is being processed:				CurrentIndex;
//
//   this implementation also caches the list of all keys at construction time into 'CurrentKeys'
//   

public class ElementIterator implements Iterator<ContainedElement> {

	
	ElementContainer it;
	List<String> CurrentKeys;
	int keyIndex;
	int CurrentIndex;
	
	
	// this constructor accepts the injected container 
	// parameter (myData), and saves it to a reference called 'it')
	// all other tracking data is initialized to 0
	// and the list of Keys is extracted and saved
    ElementIterator(ElementContainer myData)
    {
    	it = myData;
    	CurrentIndex = 0;
    	keyIndex = 0;
    	CurrentKeys = new ArrayList<String>();
    	for (String k : it.theData.keySet())
    	{
    		CurrentKeys.add(k);
    	}
        
    }
    
    
    // to determine if there is any additional data we need to check
    // 1. if the keyindex is too large, we have consumed all keys and no more data is available
    // 2. if there is a current list, and we are not at the end of it, then there is another item available
    // 3. if we are at the end of the current list, and there is another key, then more data is available
    // 4. if we are out of keys, then no more data is available.
	@Override
	public boolean hasNext() {
		
		if (keyIndex >=CurrentKeys.size()) 
			return false;  //In case the map is empty
		var list = it.theData.get(CurrentKeys.get(keyIndex));
		var count = list.size();
		if (CurrentIndex < count) 
			return true;  // there is another item in the current LIST
		if (keyIndex < CurrentKeys.size()-1) 
			return true; // there is another key available
		
		return false;
	}
	
	// getting access to the next item is performed in two stages. This method checks to see if
	// there is another element at this key, and if so it is returned.
	// otherwise it checks to see if there are more keys, and if not, it returns null
	// if there are, then it moves to the next key and tries to return the first element in that key
	
	
	// due to the way the JAVA iterator is designed, you can retrieve a given item one time.
	// retrieving an item moves the cursor to the next item.
	// this is in contrast to the alternative iterator logic used in .net
	// this alternative iterator logic is also discussed in the other iterator package

	@Override
	public ContainedElement next() {
		ContainedElement rv = nextElementThisKey();
		if (rv != null) return rv;
		var keyCount = it.theData.keySet().size();
		if (keyIndex < keyCount) // there is another key available
		{
			keyIndex++;
			if (keyIndex >=CurrentKeys.size()) return null;  // in case the map is empty
			CurrentIndex = 0;
			return nextElementThisKey();
		}
		
		return null;
	}
	
	
	// this helper function helps us get the next element from the list in the current key
	// if we are out of elements it returns null
	// otherwise it returns the current element and updates the index to the next element
	// this method does not try to update the key in any way.  That is left up to the method
	// calling us.
	
	ContainedElement nextElementThisKey()
	{
		if (keyIndex >=CurrentKeys.size()) return null;  // in case the map is empty
		var list = it.theData.get(CurrentKeys.get(keyIndex));
		var count = list.size();
		if (CurrentIndex < count) return list.get(CurrentIndex++);  // return the next item in the current LIST
        return null;
	}

}
