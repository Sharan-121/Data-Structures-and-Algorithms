#include <stdio.h>

int gcd(int a ,int b);


void leftRotate(int arr[], int d, int n)
{
    d = d % n;
    int cycles = gcd(d,n);
    int temp, j, k;
    for (int i = 0; i < cycles; i++)
    {
        temp = arr[i];
        j = i;
        while (1)
        {
            k = (j + d);
            if (k>=n){
                k=k-n;
            }
            if (k == i)
            {
                break;
            }
            arr[j] = arr[k];
            j = k;
        }
        arr[j] = temp;
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}

int gcd(int a, int b)
{
    if (b == 0)
    {
        return a;
    }
    else
    {
        return gcd(b, a % b);
    }
}

int main()
{
    int arr[] = {3,4,5,6,7,8};
    int d = 2;
    int n = 6;
    leftRotate(arr,d,n);
    return 0;
    

}
