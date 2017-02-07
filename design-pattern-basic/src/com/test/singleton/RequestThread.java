package com.test.singleton;

public class RequestThread extends Thread{
	private String requestId;
	
	public RequestThread( final String requestId ){
		this.requestId = requestId;
	}
	
	public void run(){
		printCount();
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
