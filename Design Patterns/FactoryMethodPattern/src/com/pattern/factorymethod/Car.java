package com.pattern.factorymethod;

public class Car implements Product{
	private Product mEngine;
	private Product mUnderpan;
	private Product mWheel;
	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("汽车描述:");
		mEngine.describe();
		mUnderpan.describe();
		mWheel.describe();
	}
	
	public Car(Product mEngine,Product mUnderpan,Product mWheel){
		this.mEngine = mEngine;
		this.mUnderpan = mUnderpan;
		this.mWheel = mWheel;
	}



}
