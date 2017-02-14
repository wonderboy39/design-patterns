package com.strategy.problem;

public class Apple extends Fruits{
	public Apple(){
		setName("APPLE");
	}
	
	@Override
	public void printDuty() {
		System.out.println("Duty Not Exists.");
	}

	@Override
	public void printFeatures() {
		System.out.println("아침에 먹어야 좋습니다. 노화예방에 좋은 과일입니다.");
	}
}