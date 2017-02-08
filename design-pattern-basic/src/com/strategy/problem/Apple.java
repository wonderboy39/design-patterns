package com.strategy.problem;

public class Apple extends Fruits{
	public Apple(){
		setName("APPLE");
	}
	
	@Override
	public void printDuty() {
		System.out.println("Duty Not Exists.");
	}
}
