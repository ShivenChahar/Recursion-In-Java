public class SumOfDigits {
  public static void main(String[] args) {
    int sum = SumRecursive(543);
    System.out.println(sum);
  }
  static int SumRecursive (int n) {
    if ( n == 0) {
      return 0;
    }
    return (n % 10) + SumRecursive(n / 10);
  }
}
