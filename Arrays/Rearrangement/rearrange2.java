import java.util.*;

class Solution1 {

    public void rotate(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public void rotate1(int arr[], int start, int end) {
        this.rotate(arr, start, end - 1);
        this.rotate(arr, start, end);
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class rearrange2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Solution1 obj = new Solution1();

        int mid = (0 + (size - 1)) / 2;
        obj.rotate(arr, 0, mid);

        int minPointer = 1;
        int maxPointer = mid + 1;
        while (maxPointer < size) {
            obj.rotate1(arr, minPointer, maxPointer);
            minPointer += 2;
            maxPointer += 1;
        }
        obj.printArray(arr);

    }
}
