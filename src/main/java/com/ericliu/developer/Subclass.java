package com.ericliu.developer;// javap -v -p -s -sysinfo -constants Subclass\$InnerClass.class
// javap -v -p -s -sysinfo -constants Subclass\$EricLiu.class



public class Subclass extends Superclass {
	int subMember;
	

	private void interestingMethod(){
		System.out.println("Subclass is interesting");
	}
	
	@Override
	protected void notSoInteresting() {
		super.notSoInteresting();
		System.out.println("Subclass is not so interesting.");
	}
	
	
	public class Innerclass{
		
		void changeOuterMember(){
			subMember = 3;
		}
	}
	
	public void accessInnerStaticClassFields(){
		EricLiu eric = new EricLiu();

		// one common use of the is in the Builder Pattern where the Outer Class's fields
		// are assigned values from the fields of the builder instance
		long copyEricId = eric.ericId;
	}
	
	
	public static class EricLiu{
		private long ericId = 123L;
	} 
}
