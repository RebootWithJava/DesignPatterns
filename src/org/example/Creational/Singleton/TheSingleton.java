package org.example.Creational.Singleton;


import java.util.concurrent.atomic.AtomicInteger;

public class TheSingleton {
	
	private String myString="default value";
	private double myNumber= 0;
	
	private static TheSingleton theSingleInstance = new TheSingleton(); 

//  if thread safety is not an issue this implementation is OK
//	public static TheSingleton getInstance()
//	{
//		return theSingleInstance;
//	}
	
	// or for thread safety
	// ********************************************************************************************************************************
	// for thread safety and multiple threads potentially running
	// ********************************************************************************************************************************
	
	static AtomicInteger Initializing = new AtomicInteger(0);
	static Object lock = new Object();
	
	public static TheSingleton getInstance() 
	{
		// goals:  1. only do ONE concurrency check per 'getInstance' (except during actual initialization) 
		//         2. only need to create an instance if this is the first call to getInstance
		//         3. if a second thread comes in while the item is being constructed, the second thread should wait
		//
		
		// a.      a is the only concurrency check that will occur AFTER the instance has been fully initialized.
		//               if Initializing is 0, this means no threads have yet entered stage c  
		//               if it is 1, this means that this is a second thread and the first has already entered stage c and is
		//                  initializing the singleton.
		//               if it is 2, the singleton is completely initialized
		//                 
		//
		//  b.     b is the (somewhat more expensive) synchronization context.  It is only established to insure that the singleton
		//               is not allocated twice.  Java guarantees that only one thread will be in the context at a time.  All other 
		//               threads that call getInstance will end up waiting to enter the protected block at step b
		//  
		//  c.     all threads except for the first will be blocked at step b, but on step c, only the first thread will see the
		//               value of 0.   all other threads will block, and only when the first is done will they enter this section.
		//               
		//  d.     only the first thread can get into section d.  Once in this section the initializing will become 1 until the
		//               initialization is finished, then it is set to 2.
		//
		//  e.     all threads that come in after the first, but before it is completely done initializing will wait at b, then at c 
		//               when they get to enter the synchronized section, they will find that the value in initializing is going to be
		//               2 (they might see 1 a stage a, but they will net get beyone stage b), so they will end up skipping stage d
		//               and will jump to stage e
		// 
		
		// a [get the value in the variable initializing]
		if (2 != Initializing.get())
		{
			// b   [ can only get here if the value in initializing is 0 or 1 ]
			synchronized(TheSingleton.class)
			{
				   // c  [ will only be 0 for the first thread , should be 2 for all others ]
				   if (0 == Initializing.compareAndExchange(0, 1))
				   {
				       // d [ only the first thread will be able to get in this section of code ]
					   // --------------------------------------------------------------------------------------------------
					   theSingleInstance = new TheSingleton(); // this is the line that might take a very long time, and is
					                                           // why all the synchronization code is necessary
					   // --------------------------------------------------------------------------------------------------
					   Initializing.set(2); // [all other threads are waiting at stage b to get in the synchronized region]
				   }
				   // e [ all threads including the first will execute this empty line]
		    }
		}
		
		// f  [ all threads and all future invocations will execute this line ]
		return theSingleInstance;
	}
	// ****************  End of thread safety region
	// ********************************************************************************************************************************
	// ********************************************************************************************************************************
	// ********************************************************************************************************************************

	
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public double getMyNumber() {
		return myNumber;
	}
	public void setMyNumber(double myNumber) {
		this.myNumber = myNumber;
	}
	
	public String toString()
	{
		return String.format("TheSingleton myString:'%s' myNumber:%f  %s", myString, myNumber,super.toString());
	}
	
	

}
