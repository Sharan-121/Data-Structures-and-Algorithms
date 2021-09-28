public class rearrange4 {

    public static void rearrange(int arr[],int index[]){
        
        for(int i = 0;i<index.length;){
            if(index[i] == i){
                i++;
            }
            else{
               swap(arr,index[i],index[index[i]]);
               swap(index,index[i],index[index[i]]); 
            }
        
        }

    }
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n-------------------\n");
    }
    public static void main(String args[]){
        int arr[] = { 50, 40, 70, 60, 90 };
        int index[] = { 3, 0, 4, 1, 2 };
        rearrange(arr, index);
        printArray(arr);
        printArray(index);

        

    }
}
