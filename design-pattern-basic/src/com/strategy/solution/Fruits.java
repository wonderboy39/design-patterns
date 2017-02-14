package com.strategy.solution;

public abstract class Fruits {
	private int price;
	private String name;
	private DutyBehavior dutyBehavior = null;
	public Fruits(){}
	public void setPrice(final int price){
		this.price = price;
	}
	public void setName(final String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void printPrice(){
		System.out.println(name + " :: price == " + String.valueOf(price));
	}
	
	public void setDutyBehavior(DutyBehavior dutyBehavior){
		this.dutyBehavior = dutyBehavior;
	}
	
	public void printDuty(){
		this.dutyBehavior.printDuty();
	}
	
	public abstract void printFeatures();
}