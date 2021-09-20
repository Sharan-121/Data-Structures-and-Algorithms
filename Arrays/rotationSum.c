#include <stdio.h>

int main()
{
    int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int arrSum = 0;
    int currVal = 0;
    int maxVal;
    int n = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < (n); i++)
    {
        arrSum += arr[i];
        currVal += arr[i] * i;
    }
    maxVal = currVal;
    for (int j = 1; j < n; j++)
    {
        currVal = currVal + arrSum - (n * arr[n - j]);
        if (currVal > maxVal)
        {
            maxVal = currVal;
        }
        
    }
    printf("%d ", maxVal);
    
}