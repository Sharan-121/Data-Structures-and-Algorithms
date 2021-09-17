#include <stdio.h>

int pivotSearch(int arr[],int start,int end);
int findPair(int arr[],int n,int key);

int findPair(int arr[],int n,int key){
    int i = pivotSearch(arr,0,n-1);
    int j= i + 1;
    
    while(i != j){
        int sum = arr[i] + arr[j];

        if(sum == key){
           return 1;
        }
        else if(sum > key){
            i = (n + i - 1)%n;
        }
        else{
            j = (j+1)%n;
        }
    }
    return 0;
    
   
}
int pivotSearch(int arr[],int start,int end){
    if(arr[start] <= arr[end]){
        return end;
    }

    while(start <= end){
        int mid = (start+end)/2;

        if (arr[mid] > arr[mid+1]){
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
int main(){
    int arr[] = {11, 15, 6, 8, 9, 10};
    
    printf("%d",findPair(arr,6,18));
}