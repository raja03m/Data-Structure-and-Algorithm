package sorting;

import java.util.Arrays;

public class Sorting_N_meeting_in_oneroom {
    
	public static int maxMeetings(int[] start, int[] end) {

	int n = start.length;
    int[][] meetings = new int[n][2];

    for (int i = 0; i < n; i++) {
        meetings[i][0] = start[i];
        meetings[i][1] = end[i];
    }

    Arrays.sort(meetings, (a, b) -> a[1] - b[1]);

    int count = 1;
    int lastEnd = meetings[0][1];

    for (int i = 1; i < n; i++) {
        if (meetings[i][0] > lastEnd) {
            count++;
            lastEnd = meetings[i][1];
        }
    }
	
    return count;
}

public static void main(String[] args) {
    int[] start = {1, 3, 0, 5, 8, 5};
    int[] end = {2, 4, 6, 7, 9, 9};

    System.out.println(maxMeetings(start, end)); // Output: 4
	}
}

