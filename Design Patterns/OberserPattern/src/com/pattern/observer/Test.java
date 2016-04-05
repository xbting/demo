package com.pattern.observer;

public class Test {
	private static ConcreteSubject subject;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("a"));
		subject.attach(new ConcreteObserver("b"));
		subject.attach(new ConcreteObserver("c"));
		subject.attach(new ConcreteObserver("d"));
		subject.notifyObserver();
	}
	
	

}
