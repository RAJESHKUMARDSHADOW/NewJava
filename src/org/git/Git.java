package org.git;

public class Git {

	// master
	public static void main(String[] args) {
		// master
		System.out.println("Hello World!");

		Git git1 = new Git();
		git1.norandyCorporation();
		// worker
		Git g = new Git();

		g.branch();

		// next update
		g.nextbranch();

	}

	// kumar code
	private void norandyCorporation() {
		System.out.println("wat you want is nothing");

	}

	// worker
	private void branch() {

		System.out.println("Normal worker");
	}

	// next update
	private void nextbranch() {
		// TODO Auto-generated method stub

	}

}
