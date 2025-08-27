public class ReverseANumber {
  public static void main(String[] args) {
    ReverseReccursive(1234);
    System.err.println(sum);
  }
  static int sum = 0;
  static void ReverseReccursive (int n) {
    if (n == 0) {
      return;
    }
    int rem = n % 10;
    sum = sum * 10 + rem;
    ReverseReccursive(n / 10);
  }
}