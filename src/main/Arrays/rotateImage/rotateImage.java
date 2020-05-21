package main.Arrays.rotateImage;

public class rotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        // Expected output
        //            [
        //            [15,13, 2, 5],
        //            [14, 3, 4, 1],
        //            [12, 6, 8, 9],
        //            [16, 7,10,11]
        //            ]
    }

    public static int[][] rotate(int[][] matrix) {
        int length = matrix.length;

        for (int col = 0 ; col < length ; col++) {
            for (int row = 0; row < length ; row++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[length - row - 1][col];

                matrix[length - row - 1][col] = temp;
            }
        }

        for (int col = 0 ; col < length ; col++) {
            for (int row = col + 1; row < length; row++) {
                int temp = matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }

        return matrix;
    }
}
