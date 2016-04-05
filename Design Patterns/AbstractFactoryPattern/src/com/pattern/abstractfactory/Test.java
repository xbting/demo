package com.pattern.abstractfactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		factory.createProductA().show();
		factory.creteProductB().show();
	}

}
