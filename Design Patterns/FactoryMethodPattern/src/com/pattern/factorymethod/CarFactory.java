package com.pattern.factorymethod;

public class CarFactory implements Factory{


	@Override
	public Product create() {
		
		Car car = new Car(new EngineFactory().create(), new UnderpanFactory().create(), new WheelFactory().create());
		return car;
		// TODO Auto-generated method stub
		
	}

}
