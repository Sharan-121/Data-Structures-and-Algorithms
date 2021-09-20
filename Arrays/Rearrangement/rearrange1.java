public class rearrange1{
    public static void main(String args[]){
        int arr[] =  {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int temp;
        for(int i =0;i<arr.length;){
            if(arr[i]!=-1 && arr[i] != i){
                temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}