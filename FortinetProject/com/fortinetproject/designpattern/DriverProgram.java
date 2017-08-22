package com.fortinetproject.designpattern;

public class DriverProgram {

	 public static void main(String[] args) {
		 
			Mobile mobile;
			
			mobile= MobileFactory.createMobile(Mobile.SAMSUNG);
			mobile.getMobileDetails();
			
			mobile = MobileFactory.createMobile(Mobile.IPHONE);
			mobile.getMobileDetails();
			
			mobile = MobileFactory.createMobile(Mobile.SONY);
			mobile.getMobileDetails();
			
		}
}
