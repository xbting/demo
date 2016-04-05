package com.pattern.simplefactory;

public class CarFactory {
	enum CarType {
		Benz, BMW
	}

	public static Car create(CarType type) {
		if (type == CarType.Benz) {
			return new BenzCar();
		} else if (type == CarType.BMW) {
			return new BMWCar();
		}
		return null;

	}

}
