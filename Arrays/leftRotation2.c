void swap(int arr[],int n,int d);

void leftRotate(int arr[], int n, int d) {
    // code here'
    if (d == 0){
        return;
    }
    d = d % n;
    swap(arr,0,d-1);
    swap(arr,d,n-1);
    swap(arr,0,n-1);
    
}
void swap(int arr[],int start,int end){
    int temp;
    while (start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        start++;
        end --;
    }
}