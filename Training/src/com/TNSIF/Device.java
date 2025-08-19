package com.TNSIF;

public class Device {

	void deviceType() {
		System.out.println("I am an electric device");
	}
}
class Phone extends Device{
	void brand() {
		System.out.println("Brand : Samsung");
	}
}
class Smartphone extends Phone{
	void features() {
		System.out.println("Touchscreen, Triple Camera");
	}
}

