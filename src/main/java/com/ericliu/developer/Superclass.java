package com.ericliu.developer;

// javap -v -p -s -sysinfo -constants EricLiu.class
public class Superclass {
	
	
	private void interestingMethod(){
		System.out.println("Superclass is interesting. ");
	}
	
	protected void notSoInteresting(){
		System.out.println("Superclass is not interesting.");
	}
	
	void exampleMethod(){
		interestingMethod();
		notSoInteresting();
	}
}
