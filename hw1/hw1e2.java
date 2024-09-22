package hw1;

public class hw1e2 {

  /** Returns the maximum value from m. */
  public static int max(int[] m) {
    int max = 0;
    for (int i = 0; i < m.length; i++) {
        int current = m[i];
      if (current > max) {
        max = current;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
    System.out.println(max(numbers));
  }
}
