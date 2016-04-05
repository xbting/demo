package com.pattern.factorymethod;

public class EngineFactory implements Factory{

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return new Engine();
	}

}
