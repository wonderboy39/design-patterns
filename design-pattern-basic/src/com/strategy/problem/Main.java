package com.strategy.problem;

public class Main {
	public static void main(String [] args){
		Fruits apple = new Apple();
		apple.setPrice(500);
		System.out.println("=== 품목명 : " + apple.getName() + " ===");
		apple.printPrice();
		apple.printDuty();
		apple.printFeatures();
		
		System.out.println();
		
		Fruits banana = new Banana();
		banana.setPrice(1000);
		System.out.println("=== 품목명 : " + banana.getName() + " ===");
		banana.printPrice();
		banana.printDuty();
		banana.printFeatures();
	}
}