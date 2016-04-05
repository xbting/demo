package com.pattern.factorymethod;

public class UnderpanFactory implements Factory{

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return  new Underpan();
	}


}
