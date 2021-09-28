public class replace {
    public static void replace1(int arr[]){
        if(arr.length <=1){
            return;
        }
        int prev = arr[0];
        arr[0] = arr[0] *arr[1];

        for(int i = 1;i<(arr.length)-1;i++){
            int current = arr[i];
            arr[i] = prev*arr[i+1];
            prev = current;
        }
        arr[(arr.length)-1] = arr[(arr.length)-1]*prev;
        
    }
    
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6};
        replace1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
