public class Palindrome {
  public static void main(String[] args) {
    int n = 12321;
    System.out.println(PalindromeReccursive(n));
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
  static boolean PalindromeReccursive (int n) {
    ReverseReccursive(n);
    return (n == sum);
  }
}
