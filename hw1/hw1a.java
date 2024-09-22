package hw1;
/**
 * Exercise 1a: Drawing and Triangle
 */
public class hw1a {

  public static void main(String[] args) {
    int a = 0;
    String star = "*";
    while (a <= 5) {
      System.out.println(star.repeat(a));
      a++;
    }
  }
}
