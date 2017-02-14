package com.strategy.solution;
// 달라지는 속성 
// 1 - DutyExistBehavior 
public class DutyExistBehavior implements DutyBehavior{
	@Override
	public void printDuty() {
		System.out.println("Duty Exists.");
	}

}