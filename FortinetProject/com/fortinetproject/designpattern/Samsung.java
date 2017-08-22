package com.fortinetproject.designpattern;

public class Samsung implements Mobile  {
	
	    private int ramSize;
		private String processor;
		public String name = Mobile.SAMSUNG;
		public Samsung(int ramSize){
			this.ramSize = ramSize;
		}
		
		public Samsung(String processor){
			this.processor = processor;
			this.ramSize =2;
		}

		@Override
		public void getMobileDetails() {
			// TODO Auto-generated method stub
			
			System.out.println("Samsung [ramSize=" + ramSize + ", processor=" + processor
					+ ", name=" + name + "]");
		}

		
		
}
