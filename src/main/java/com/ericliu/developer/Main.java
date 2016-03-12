package com.ericliu.developer;

public class Main {

	public static void main(String[] args) {
		Superclass sup = new Superclass();
		sup.exampleMethod();
		
		Subclass sub = new Subclass();
		
		Subclass.Innerclass inn = sub.new Innerclass();
		inn.changeOuterMember();
		sub.exampleMethod();
		
		
		
	}

}
