package com.strategy.problem;

public abstract class Fruits {
	private int price;
	private String name;
	public Fruits(){}
	public void setPrice(final int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setName(final String name){
		this.name = name;
	}
	
	public void printPrice(){
		System.out.println(name + " :: price == " + String.valueOf(price));
	}
//	public abstract void printPrice();
	public abstract void printDuty();
}