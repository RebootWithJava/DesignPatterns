package org.example.Behavioral.Iterator.NET;

// this generic interface is used to mark a class as a container
// T is the class that is being contained

public interface IEnumerable<T> {
    IEnumerator<T> getEnumerator();
}
