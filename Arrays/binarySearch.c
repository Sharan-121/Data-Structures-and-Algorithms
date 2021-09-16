#include <stdio.h>

int binarySearch(int arr[], int start, int end, int key);

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    printf("%d", binarySearch(arr, 0, 6, 7));
}
int binarySearch(int arr[], int start, int end, int key)
{

    if (end >= start)
    {
        int mid = (start + end) / 2;

        if (arr[mid] == key)
        {
            return mid;
        }
        else if (arr[mid] < key)
        {
            return binarySearch(arr, mid + 1, end, key);
        }
        else if (arr[mid] > key)
        {
            return binarySearch(arr, start, mid - 1, key);
        }
    }
    return -1;
}