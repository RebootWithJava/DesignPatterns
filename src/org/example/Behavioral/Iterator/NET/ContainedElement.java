package org.example.Behavioral.Iterator.NET;


//this is a simple class that is contained in some sort of container class
//it represents a line item in a tax calculator in order to determine if your
//tax liability when income falls within a specific range for a given state 


public class ContainedElement 
{
      String Key;
      String State;
      double Floor;
      double Ceiling;
      double Rate;
      
      public ContainedElement(String key, String state, double floor, double ceiling, double rate)
      {
    	  Key = key;
    	  State = state;
    	  Floor = floor;
    	  Ceiling = ceiling;
    	  Rate = rate;
      }
      
      public String toString()
      {
    	  return String.format("%-3s %-15s %12.2f %12.2f %12.2f", Key,State,Floor,Ceiling,Rate);
      }
      
}
