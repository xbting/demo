package com.pattern.factorymethod;

public class WheelFactory implements Factory{

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return new Wheel();
	}
	
	

}
