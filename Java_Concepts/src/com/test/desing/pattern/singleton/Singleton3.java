package com.test.desing.pattern.singleton;

/*
 * 
 * Here's a very popular implementation using a static class, 
 * which brings the powers of lazy loading and thread safety. -- Bill Pugh implementation
 */

/*
 * When Singleton3 class is loaded, SingletonUsingInner class will not be loaded in memory. 
 * It will be loaded only when it gets called from getInstance()
 * 
 * 
 * The Java class loading mechanism ensures that the static inner class is loaded and initialized when the class is first referenced. 
 * This is done in a thread-safe manner.The JVM handles the initialization of classes (including static fields) in a thread-safe way. 
 * The Java Language Specification guarantees that the class initialization phase will be executed by the JVM as a synchronized block, 
 * which ensures that it is executed only once, even if multiple threads are trying to access it simultaneously.
   This means that the JVM guarantees that a class is initialized once and only once, and that this process is automatically synchronized, 
   making it inherently thread-safe.
 */

public class Singleton3 {
	
	
	private Singleton3() {}
    
	//inner static class which will be referenced after getInstance() is called
	private static class SingletonUsingInner 
	{
        private static Singleton3 mySingleton = new Singleton3();
    }
    
    public static Singleton3 getInstance() 
    {
        return SingletonUsingInner.mySingleton;
    }

}
