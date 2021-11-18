import java.util.*;

class nextGreaterElement {
    static void nGU(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            result[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "------>" + result[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        nGU(arr);
    }
}