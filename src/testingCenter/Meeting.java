package testingCenter;

public class Meeting {

	public static void main(String[] args) {
		int[][] array1 = {{0,30},
				{5,10},
				{15,20}};
		meetingNum(array1);

	}
	
	public static void meetingNum(int[][] n) {
		int holdMeeting = 0;
		int meetinRooms = 0;
		for(int i = 1; i<n.length; i++) {
			
			if (n[i][0] <= holdMeeting) {
				
				meetinRooms++;
				
			}
			
			if (n[i][1] > holdMeeting) {
			holdMeeting = n[i][1];
			}
			
			
			
		}
		
		System.out.println(meetinRooms);
		
		
	}

}
