public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int arr[], int target, int start, int end) {
        if (arr.length == 0){
        return -1;
        }
        if (end >= start) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return search(arr, target, start, mid - 1);
            } else if (arr[mid] < target) {
                return search(arr, target, mid + 1, end);
            }
        }

        return -1;

    }
}
