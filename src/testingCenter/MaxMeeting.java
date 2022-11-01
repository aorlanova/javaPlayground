package testingCenter;

public class MaxMeeting {

	public static void main(String[] args) {
		int[][] bobo = {{0,30},{5,10},{15,20}};
		int[][] bobo2 = {{0,30},{5,10},{15,20},{0,30},{0,45}};
		maxMeeting(bobo);
		maxMeeting(bobo2);
	}
	
	public static int maxMeeting(int[][] n) {
		
		int[] startTimes = new int[n.length];
		int[] endTimes = new int[n.length];
		for (int i = 0; i<n.length; i++) {
			
			startTimes[i] = n[i][0];
			
		}
		
		for (int i = 0; i<n.length; i++) {
			
			endTimes[i] = n[i][1];
			
		}
		
		endTimes = quickSort(endTimes);
		startTimes = quickSort(startTimes);
		int et = 0;
		int st = 0;
		int count = 0;
		int rooms = 0;
		
		for(int i = 0; i < n.length; i++) {
			rooms = count;
			if(startTimes[st] < endTimes[et]) {
				
				count++;
				st++;
				
				
			} else {
				
				count--;
				et++;
				
			}
			
			rooms = Math.max(count, rooms);
			
		}
		
		System.out.println(rooms);
		return rooms;
		
		
		
	}
	
	static int max;
	static int min;
	static int pivot;
	static int j;
	static int check;
	static int holder = 0;
	
	public static int[] quickSort(int[] n) {
		
		check = j+1;
		pivot = n[n.length-1];
		max = n.length-1;
		min = 0;
		j = -1;
		
		for (int i = min; i <= max; i++) {
			
			if (n[i] < pivot) {
				
				j++;
				holder = n[j];
				n[j] = n[i];
				n[i] = holder;
				
			}
			
		} holder = n[j+1];
		n[j+1] = n[max];
		n[max] = holder;
		 
		if(j+1 != check) {
			
			quickSort(n);
			
		}
		
		return n;
		
		
	}

}
