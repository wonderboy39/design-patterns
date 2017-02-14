package com.strategy.solution;
// 달라지는 속성 
// 2 - DutyNotExistBehavior
public class DutyNotExistBehavior implements DutyBehavior{
	@Override
	public void printDuty() {
		System.out.println("Duty does not exists.");
	}
}