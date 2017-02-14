package com.strategy.problem;

public class Banana extends Fruits{
	public Banana(){
		setName("BANANA");
	}

	@Override
	public void printDuty() {
		System.out.println("Duty Exists.");
	}

	@Override
	public void printFeatures() {
		System.out.println("비타민 A,D가 풍부하고, 소화가 잘되는 탄수화물 식품입니다.");
	}
	
}