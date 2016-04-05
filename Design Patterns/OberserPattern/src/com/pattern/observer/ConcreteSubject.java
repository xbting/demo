package com.pattern.observer;


public class ConcreteSubject extends Subject{
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer obs : vector) {
			obs.update();
		}
	}

}
