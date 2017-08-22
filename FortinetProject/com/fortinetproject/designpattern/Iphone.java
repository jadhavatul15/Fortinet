package com.fortinetproject.designpattern;

public class Iphone implements Mobile {

	private int ramSize;
	private String processor;
	private String GPU;
	
	public Iphone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}

	@Override
	public void getMobileDetails() {
		// TODO Auto-generated method stub
		
		System.out.println(	"Iphone [ramSize=" + ramSize + ", processor=" + processor
				+ ", GPU=" + GPU + "]");
	}

	
	
}
