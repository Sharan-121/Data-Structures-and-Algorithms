import java.util.Stack;

class Sol {
    Stack<Integer> mystack = new Stack<Integer>();

    void nextGreaterToLeft(int[] arr, int[] res) {
        mystack.push(0);
        res[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            while (!mystack.isEmpty() && arr[mystack.peek()] <= arr[i])
                mystack.pop();

            res[i] = (mystack.isEmpty()) ? 0 : mystack.peek() + 1;
            mystack.push(i);
        }
    }

    void nextGreaterToRight(int[] arr, int[] res) {
        mystack.clear();
        int n = arr.length;
        res[n - 1] *= 0;
        mystack.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (!mystack.isEmpty() && arr[mystack.peek()] <= arr[i]) {
                mystack.pop();
            }
            res[i] = (mystack.isEmpty()) ? 0 : res[i] * (mystack.peek() + 1);
            mystack.push(i);
        }
    }

    int maxLRP(int[] arr, int[] res) {
        nextGreaterToLeft(arr, res);
        nextGreaterToRight(arr, res);
        int max = res[0];
        for (int i = 1; i < res.length; i++) {
            max = Math.max(max, res[i]);
        }
        return max;
    }
}

public class maxLRProduct {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Sol obj = new Sol();
        int[] res = new int[n];
        int maxprod = obj.maxLRP(arr, res);
        System.out.println(maxprod);

    }
}
