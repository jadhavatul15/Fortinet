package com.fortinetproject.designpattern;

public class MobileFactory {

	public static Mobile createMobile(String type) {

		if (type.equals(Mobile.IPHONE)) {
			return new Iphone(2, "quad-core", "172.8");
		} else if (type.equals(Mobile.SONY)) {
			return new Sony(3, "quad-core");
		} else if (type.equals(Mobile.SAMSUNG)) {
			return new Samsung("Intel");
		} else {
			return null;
		}

	}
}
