package org.git;

public class Git {

	public static void main(String[] args) {
		//master
		System.out.println("Hello World!");
		
		//worker
		Git g = new Git();
		
		g.branch();
		
		//next update
		g.nextbranch();
	}
	//worker
	private void branch() {

		System.out.println("Normal worker");
	}
	
	//next update
	private void nextbranch() {
		// TODO Auto-generated method stub

	}

}
