package com.fortinetproject.designpattern;

public class Sony implements Mobile {

	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}

	@Override
	public void getMobileDetails() {
		// TODO Auto-generated method stub

		System.out.println( "Sony [ramSize=" + ramSize + ", processor=" + processor + "]");
	}

	
	
}
