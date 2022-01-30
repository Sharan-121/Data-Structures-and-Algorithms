import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.toString(search(arr, 34)));
    }

    // Searching in the row provided.
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            return binarySearch(matrix, row, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cmid = col / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[] { mid, cmid };
            } else if (matrix[mid][cmid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Two rows are remaining.

        if (matrix[rStart][cmid] == target) {
            return new int[] { rStart, cmid };
        }
        if (matrix[rStart + 1][cmid] == target) {
            return new int[] { rStart + 1, cmid };
        }

        if (target <= matrix[rStart][cmid - 1]) {
            return binarySearch(matrix, rStart, 0, cmid - 1, target);
        }
        if (target >= matrix[rStart][cmid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, rStart, cmid + 1, col - 1, target);
        }
        if (target <= matrix[rStart + 1][cmid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cmid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cmid + 1, col - 1, target);
        }

    }
}
