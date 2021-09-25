public class rearrange3{

    static void rearrange(int arr[],int n){
        int pos = partition(arr, n)+1;
        int neg = 0;

        while(arr[neg] < 0 && pos< n && neg < pos){
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg+=2;

        }
        printArray(arr,n);
       
        
    }
    static int partition(int arr[],int n){
        int i = -1;
        int temp = 0;
        for(int j = 0;j<n;j++){
            if(arr[j]<0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
        
    }
    static void printArray(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {-1, 2, -3, 4, 5, 6, 8, 9};
        rearrange(arr,arr.length);
    }
}