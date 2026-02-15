package dsa;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int count = 1;

        while (left <= right && top <= bottom) {

            // 1️⃣ Left → Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

            // 2️⃣ Top → Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

            // 3️⃣ Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }

            // 4️⃣ Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
