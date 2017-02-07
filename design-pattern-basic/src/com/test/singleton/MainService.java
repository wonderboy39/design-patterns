package com.test.singleton;

public class MainService {
	private static final int MAX_REQ = 5;
	public static void main(String [] args){
		RequestThread [] requestPool = new RequestThread[MAX_REQ];
		for(int i = 0; i<MAX_REQ; i++){
			requestPool[i] = new RequestThread("Req."+(i+1));
			requestPool[i].start();
		}
	}
}