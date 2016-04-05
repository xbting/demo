package com.pattern.observer;


public class ConcreteObserver implements Observer{
	private String name="";
	public ConcreteObserver(String name){
		this.name = name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n需要更新了，"+name);
	}


}
