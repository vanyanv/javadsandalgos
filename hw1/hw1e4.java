package hw1;

public class hw1e4 {

  public static void windowPosSum(int[] a, int n) {
    /** your code here */
    for (int i = 0; i < a.length; i++) {
      int current = a[i];

      if (current < 0) {
        continue;
      }
      for (int j = 0; j < n; j++) {
        int next = i + j + 1;
        if (next >= a.length) {
          break;
        }
        a[i] += a[next];
        
      }
    }
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, -3, 4, 5, 4 };
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
