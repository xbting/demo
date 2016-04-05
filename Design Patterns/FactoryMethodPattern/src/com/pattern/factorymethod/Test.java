package com.pattern.factorymethod;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory carFactory = new CarFactory();
		Product car = carFactory.create();
		car.describe();
	}

}
