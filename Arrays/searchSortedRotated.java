##Search in a sorted rotated array.

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        while(l<=h){
            int mid = (l+h)/2;
            
            if (A[mid] == key) return mid;
            else if (A[mid] >= A[l]){
                if(key >= A[l] && key <= A[mid]){
                    h = mid-1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(key >= A[mid] && key <= A[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }
        }  
        return -1;
    }
}