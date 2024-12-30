package stack;

import java.util.Stack;

public class Stack_smallerOnLeft {
	
    public static void nearestSmaller(int[] arr) {

	int n = arr.length;
	int[] result = new int[n];
	Stack<Integer> stack = new Stack<>();

	for(int i = 0;i<n;i++)
	{
		while (!stack.isEmpty() && stack.peek() >= arr[i]) {
			stack.pop();
		}
		if (stack.isEmpty()) {
			result[i] = -1;
		} else {
			result[i] = stack.peek();
		}
		stack.push(arr[i]);
	}

	for(
	int i = 0;i<n;i++)
	{
		System.out.print(result[i] + " ");
	}
}

public static void main(String[] args) {
    int n = 6;
    int[] a = {1, 5, 0, 3, 4, 5};
    nearestSmaller(a);
}
}