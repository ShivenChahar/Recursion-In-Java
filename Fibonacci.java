public class Fibonacci {
  public static void main(String[] args) {
    long ans = fibonacciRecursive(7);
    System.out.println(ans);
  }
   public static long fibonacciRecursive(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative index not allowed");
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  }
}