import java.util.*;

public class rearrange2Optimized {
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

        int auxArray[] = new int[size];
        
        int i = 0;
        int j = mid+1;
        int n = 0;
        while(n<size){
            
            auxArray[n] = arr[i];
            n++;
            if (n<size){
            auxArray[n] = arr[j];
            n++;
            i++;
            j++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(auxArray[k]);
        }
    }
}