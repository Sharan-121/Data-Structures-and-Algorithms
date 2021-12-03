public class BinHeap {
    static void maxHeapify(int arr[], int n, int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int largest = i;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    static void buildHeap(int arr[], int n) {
        int non_leaf = (n / 2) - 1;
        for (int i = non_leaf; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    static void printHeap(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n");
    }

    static void heapSort(int arr[]) {
        int j = 0;
        int heapSize = arr.length;

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            heapSize = heapSize - 1;
            maxHeapify(arr, heapSize, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 3, 2, 25, 7, 17, 20, 8, 4 };
        buildHeap(arr, arr.length);
        printHeap(arr, arr.length);
        heapSort(arr);
        System.out.println("After Heap Sort:");
        printHeap(arr, arr.length);

    }
}