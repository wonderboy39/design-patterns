package com.singleton.billpugh;

public class Count {
	public int visited;							// 방문자 
	public static Count count = null; 			// Count타입의 참조변수 선언 
	
	private Count(final int visited){
		this.visited = visited;
	}
	
	public static Count getInsance(){
		return BillPughCount.INSTANCE;
	}
	
	private static class BillPughCount{
		private static final Count INSTANCE = new Count(0);
	}
	
	public void counting(){		// 방문자 수 카운팅 메서드 
		visited++;
	}
	
	public int getVisited(){	// 방문자 수 얻어오는 메서드 
		return visited;
	}
}


