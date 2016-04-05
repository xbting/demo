package com.pattern.simplefactory;

import com.pattern.simplefactory.CarFactory.CarType;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = CarFactory.create(CarType.Benz);
		Car car2 = CarFactory.create(CarType.BMW);
		car1.show();
		car2.show();
	}

}
