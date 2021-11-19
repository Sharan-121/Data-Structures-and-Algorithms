import java.util.Stack;

public class nextGreaterFreq {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 2, 1 };

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int freq[] = new int[max + 1];

        for (int i = 0; i < max + 1; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        Solution(arr, arr.length, freq);

    }

    public static void Solution(int arr[], int len, int freq[]) {
        Stack<Integer> stack = new Stack<Integer>();

        int result[] = new int[arr.length];
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            if (freq[arr[stack.peek()]] > freq[arr[i]]) {
                stack.push(i);
            } else {
                while (freq[arr[stack.peek()]] < freq[arr[i]]) {
                    result[stack.peek()] = arr[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            result[stack.peek()] = -1;
            stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i] + " ");
        }

    }
}
