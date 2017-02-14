package com.strategy.solution;

public class Mango extends Fruits{
	public Mango(){
		setName("MANGO");
	}
	@Override
	public void printFeatures() {
		System.out.println("빙수만들어 먹으면 좋지요.");
	}
}