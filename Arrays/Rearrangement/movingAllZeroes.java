class Solution {
    public void moveZeroes(int[] arr) {
        int slow = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && count == 0) {
                slow = i - 1;
                count = 1;
            } else if (arr[i] != 0 && count == 1) {
                int temp = arr[i];
                arr[i] = arr[slow + 1];
                arr[slow + 1] = temp;
                slow = slow + 1;
            }
        }
    }
}