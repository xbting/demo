package com.pattern.observer;

import java.util.Vector;

public abstract class Subject {
	protected Vector<Observer> vector;
	public Subject(){
		vector = new Vector<Observer>();
	}
	protected void attach(Observer observer){
		vector.add(observer);
	}
	protected void detach(Observer observer){
		vector.remove(observer);
	}
	
	public abstract void notifyObserver();
}
