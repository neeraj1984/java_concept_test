package com.test.design.pattern.builder;

public class BuilderExample {
	
	public static void main(String args[]) 
	{	      
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5). 
        		bakingpowder(0.75).milk(0.5).
        		build();
      
        //Cake is ready to eat :)
        System.out.println(whiteCake);
        System.out.println(whiteCake.toString()); //both result same as toString() is overridden in Cack class
    }

}
