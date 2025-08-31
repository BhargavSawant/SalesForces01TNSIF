package com.TNSIF;

public interface Smartdevice {

		void turnon();
		void turnoff();
		void getStatus();

	}
	// class implementing the interface

	class Smartlight implements Smartdevice{

		@Override
		public void turnon() {
		System.out.println("smart light is one");
			
		}

		@Override
		public void turnoff() {
			System.out.println("smart light is off");
			
		}

		@Override
		public void getStatus() {
			System.out.println("smart light is in standly mode");
			
		}
		
	}
