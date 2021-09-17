class Solution {
    int pivotIndex;
    
    int pivotPosition(int arr[],int start,int end){
        if(arr[start] <= arr[end]){
            return -1;
        }
        else{
            while(start <= end){
                int mid = (start + end)/2;
                
                if(arr[mid] > arr[mid+1]){ 
                    return mid;
                }
                else if(arr[mid] >= arr[start]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1; 
                
                }
            }
        }
        return 0;
    }
    int findKRotation(int arr[], int n) {
        pivotIndex = pivotPosition(arr,0,n-1);
        return pivotIndex+1;
        
    }
}