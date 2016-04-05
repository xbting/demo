package com.pattern.abstractfactory;

public class Factory implements IFactory{


	@Override
	public IProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

	@Override
	public IProductB creteProductB() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
