public class minSwaps {
    public static int solution(int arr[],int k){
        int minCount = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=k){
                minCount+=1;
            }
        }
        int greaterCount = 0;
        for(int i = 0;i<minCount;i++){
            if(arr[i] > k){
                greaterCount+=1;
            }
        }
        int minSwaps = greaterCount;
        for(int i = 0,j = minCount;j<arr.length;i++,j++){
            if(arr[i] > k){
                greaterCount--;
            }
            if(arr[j] > k){
                greaterCount++;
            }
            if(greaterCount < minSwaps){
                minSwaps = greaterCount;
            }
        }
        return minSwaps;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,1,2};
        int k = 5;
        System.out.println(solution(arr, k));
    }
    
}
