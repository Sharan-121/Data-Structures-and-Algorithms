#include <stdio.h>

int pivot(int arr[],int start,int end){

    while(start <= end){
        int mid = (start+end)/2;
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

int main(){
    int arr[] = {78,10,23,35,49,51,60};
    int len = sizeof(arr)/sizeof(arr[0]);
    printf("%d",pivot(arr,0,len));
}