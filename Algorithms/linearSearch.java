public class linearSearch{
    public static void main(String[] args) {
        int arr[] = {12,56,77,32};
        int target = 32;
        System.out.println(search(arr, target));
    }

    static int search(int arr[],int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}