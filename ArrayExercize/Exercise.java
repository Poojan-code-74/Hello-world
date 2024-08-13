package ArrayExercize;

public class Exercise {

  public static int sumDiagonalElements(int[][] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i][i];
    }
    return sum;
  }

  public static int[] findTopTwoScores(int[] array) {
    int max = 0;
    int max2 = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      } else if (array[i] < max && array[i] > max2) {
        max2 = array[i];
      }
    }
    ;
    return new int[] { max, max2 };
  }

  
}