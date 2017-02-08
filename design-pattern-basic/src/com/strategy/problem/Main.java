package com.strategy.problem;

public class Main {
	public static void main(String [] args){
		Fruits apple = new Apple();
		apple.setPrice(500);
		apple.printPrice();
		apple.printDuty();
		
		System.out.println();
		
		Fruits banana = new Banana();
		banana.setPrice(1000);
		banana.printPrice();
		banana.printDuty();
	}
}
