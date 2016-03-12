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
		long copyEricId = eric.ericId;
	}
	
	
	public static class EricLiu{
		private long ericId = 123L;
		
	} 
}
