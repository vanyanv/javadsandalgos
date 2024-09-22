package hw1;
public class hw1b {

  public static void drawTriangle(int n) {
    int a = 0;
    String star = "*";
    while (a <= n) {
      System.out.println(star.repeat(a));
      a++;
    }
  }

    public static void main(String[] args) {
        drawTriangle(5);
    }
}
