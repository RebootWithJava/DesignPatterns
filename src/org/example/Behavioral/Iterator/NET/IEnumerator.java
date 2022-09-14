package org.example.Behavioral.Iterator.NET;

// this generic interface is to identify the class requirements for a .net sytle iterator
// the getCurrent method can be called multiple times to gain access to the current element
// to proceed to the next element you call the next() method, which returns true or false to 
// let you know if it succeeded
//  Reset can be used to start over for those types of iterators that support it.  

public interface IEnumerator<T> {
    Boolean Next();
    T getCurrent();
    void Reset();
}
