package ArrayExercize;

import java.util.Arrays;

public class DSAArray {
    public static void main(String[] args) {
        // int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(Exercise.sumDiagonalElements(array));

        int[] array = { 3, 9, 5, 4, 2, 7, 1, 9 };
        int[] output = Exercise.findTopTwoScores(array);
        System.out.println(Arrays.toString(output));
    }
}