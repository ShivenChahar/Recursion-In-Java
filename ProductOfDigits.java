public class ProductOfDigits {
  public static void main(String[] args) {
    int Product = ProductRecursive(54032);
    System.out.println(Product);
  }
  static int ProductRecursive (int n) {
    if (n == n % 10) {
      return n;
    }
    return (n % 10) * ProductRecursive(n / 10);
  }
}
