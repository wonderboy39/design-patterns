package com.strategy.solution;

public class Main {
	public static void main(String [] args){
		 Fruits apple = new Apple();
		 apple.setPrice(800);
		 apple.setDutyBehavior(new DutyNotExistBehavior());
		 System.out.println("=== 품목명 : " + apple.getName() + " ===");
		 apple.printPrice();
		 apple.printFeatures();
		 apple.printDuty();
		 
		 System.out.println();
		 
		 Fruits banana = new Banana();
		 banana.setPrice(1000);
		 banana.setDutyBehavior(new DutyExistBehavior());
		 System.out.println("=== 품목명 : " + banana.getName() + " ===");
		 banana.printPrice();
		 banana.printFeatures();
		 banana.printDuty();
		 
		 System.out.println();
		 Fruits mango = new Mango();
		 mango.setPrice(1500);
		 mango.setDutyBehavior(new DutyExistBehavior());
		 System.out.println("=== 품목명 : " + mango.getName() + " ===");
		 mango.printPrice();
		 mango.printFeatures();
		 mango.printDuty();
	}
}
