package com.test.singleton;

public class Request {
	private String requestId;
	
	public Request(final String requestId){
		this.requestId = requestId;
	}
	
	public void printCount(){	
		// Request 객체Id, 방문자수, Count객체 id 출력 
		Count count = Count.getInsance();
		count.counting();
		
		System.out.println( 
				requestId + " connected, " +
				"visited " + count.getVisited() +
				", Count obj == " + count.toString()
		);
	}
}
