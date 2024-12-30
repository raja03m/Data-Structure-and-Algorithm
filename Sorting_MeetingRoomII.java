package sorting;

import java.util.Arrays;

public class Sorting_MeetingRoomII {
	
	public static int maxMeetings(int[] start, int[] end) {
		//return 0;
		
		//using two pointer
	//}
//		int n = start.length;
//        Integer[] startTimes = new Integer[n];
//        Integer[] endTimes = new Integer[n];
//
//        for (int i = 0; i < n; i++) {
//            startTimes[i] = start[i];
//            endTimes[i] = end[i];
//        }
//
//        Arrays.sort(startTimes);
//        Arrays.sort(endTimes);
//
//        int rooms = 0;
//        int maxRooms = 0;
//        int i = 0;
//        int j = 0;
//
//        while (i < n && j < n) {
//            if (startTimes[i] < endTimes[j]) {
//                rooms++;
//                i++;
//            } else {
//                rooms--;
//                j++;
//            }
//            maxRooms = Math.max(maxRooms, rooms);
//        }
//
//        return maxRooms;
//    }
		
		int n = start.length;
        Integer[] startTimes = new Integer[n];
        Integer[] endTimes = new Integer[n];

        for (int i = 0; i < n; i++) {
            startTimes[i] = start[i];
            endTimes[i] = end[i];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int rooms = 0;
        int maxRooms = 0;
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (startTimes[i] < endTimes[j]) {
                rooms++;
                i++;
            } else {
                rooms--;
                j++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        int[] start = {2, 9, 6};
        int[] end = {4, 12, 10};

        System.out.println(maxMeetings(start, end)); // Output: 1
    }
}