package com.TNSIF;

public class NestedInterface implements MyInterface.MyInnerInterface{

		@Override
		public void print() {
			System.out.println("inner interface method");
			
		}

	}
